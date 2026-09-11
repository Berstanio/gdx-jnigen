package com.badlogic.gdx.jnigen.generator;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The generator parses the header once per target over Zig's bundled libc headers. These tests pin the
 * clang triple, the PossibleTarget each pass stands for, and the exact include order Zig itself uses
 * (checked against `zig cc -target ... -E -v` for Zig 0.16.0).
 */
public class ParseTargetTest {

    private static final Path SYSROOT = Paths.get("/sysroot");

    private static String[] args(ParseTarget target) {
        return target.clangArguments(SYSROOT);
    }

    @Test
    void everyPassIsHermeticAndTargeted() {
        for (ParseTarget target : ParseTarget.values()) {
            String[] args = args(target);
            assertEquals("--target=" + target.getTriple(), args[0], target.name());
            assertEquals("-nostdinc", args[1], target.name());
            assertEquals("-isystem", args[2], target.name());
            assertEquals(SYSROOT.resolve("include").toString(), args[3], target.name());
        }
    }

    @Test
    void glibcTargetsUseZigsFourLayerLayout() {
        assertArrayEquals(new String[] {
                "--target=x86_64-unknown-linux-gnu", "-nostdinc",
                "-isystem", "/sysroot/include",
                "-isystem", "/sysroot/libc/include/x86-linux-gnu",
                "-isystem", "/sysroot/libc/include/generic-glibc",
                "-isystem", "/sysroot/libc/include/x86-linux-any",
                "-isystem", "/sysroot/libc/include/any-linux-any"}, args(ParseTarget.LINUX_X86_64));
        assertEquals("--target=i386-unknown-linux-gnu", args(ParseTarget.LINUX_X86)[0]);
        assertEquals("/sysroot/libc/include/x86-linux-gnu", args(ParseTarget.LINUX_X86)[5]);
        assertEquals("/sysroot/libc/include/aarch64-linux-gnu", args(ParseTarget.LINUX_AARCH64)[5]);
        assertEquals("/sysroot/libc/include/aarch64-linux-any", args(ParseTarget.LINUX_AARCH64)[9]);
        assertEquals("--target=arm-unknown-linux-gnueabihf", args(ParseTarget.LINUX_ARM)[0]);
        assertEquals("/sysroot/libc/include/arm-linux-gnu", args(ParseTarget.LINUX_ARM)[5]);
    }

    @Test
    void windowsAndDarwinTargetsUseOneHeaderSetEach() {
        assertArrayEquals(new String[] {
                "--target=x86_64-w64-mingw32", "-nostdinc",
                "-isystem", "/sysroot/include",
                "-isystem", "/sysroot/libc/include/any-windows-any"}, args(ParseTarget.WINDOWS_X86_64));
        assertArrayEquals(new String[] {
                "--target=i686-w64-mingw32", "-nostdinc",
                "-isystem", "/sysroot/include",
                "-isystem", "/sysroot/libc/include/any-windows-any"}, args(ParseTarget.WINDOWS_X86));
        assertArrayEquals(new String[] {
                "--target=aarch64-apple-macos", "-nostdinc",
                "-isystem", "/sysroot/include",
                "-isystem", "/sysroot/libc/include/any-darwin-any"}, args(ParseTarget.MACOS_AARCH64));
        assertEquals("--target=x86_64-apple-macos", args(ParseTarget.MACOS_X86_64)[0]);
    }

    @Test
    void passesMapOntoTheLayoutTargets() {
        assertEquals(PossibleTarget.UNIX_64, ParseTarget.LINUX_X86_64.getPossibleTarget());
        assertEquals(PossibleTarget.UNIX_64, ParseTarget.LINUX_AARCH64.getPossibleTarget());
        assertEquals(PossibleTarget.UNIX_64, ParseTarget.MACOS_AARCH64.getPossibleTarget());
        assertEquals(PossibleTarget.UNIX_64, ParseTarget.MACOS_X86_64.getPossibleTarget());
        // glibc i386 follows the i386 SysV ABI like bionic x86 does (8-byte members packed at 4), unlike ARM32.
        assertEquals(PossibleTarget.UNIX_X86_32, ParseTarget.LINUX_X86.getPossibleTarget());
        assertEquals(PossibleTarget.UNIX_32_NOT_X86, ParseTarget.LINUX_ARM.getPossibleTarget());
        assertEquals(PossibleTarget.WIN_64, ParseTarget.WINDOWS_X86_64.getPossibleTarget());
        assertEquals(PossibleTarget.WIN_32, ParseTarget.WINDOWS_X86.getPossibleTarget());
    }

    @Test
    void thePrimaryPassIsLinuxX86_64() {
        // The first enum constant is the pass whose model (structs, functions, enums) is emitted;
        // the other passes only contribute integer-kind observations.
        assertEquals(ParseTarget.LINUX_X86_64, ParseTarget.values()[0]);
        assertEquals(8, ParseTarget.values().length);
        assertEquals(8, Arrays.stream(ParseTarget.values()).map(ParseTarget::getTriple).distinct().count());
    }
}
