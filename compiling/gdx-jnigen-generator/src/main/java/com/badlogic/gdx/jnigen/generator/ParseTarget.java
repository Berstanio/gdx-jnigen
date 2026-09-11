package com.badlogic.gdx.jnigen.generator;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public enum ParseTarget {
    LINUX_X86_64("x86_64-unknown-linux-gnu", PossibleTarget.UNIX_64, glibc("x86")),
    LINUX_X86("i386-unknown-linux-gnu", PossibleTarget.UNIX_X86_32, glibc("x86")),
    LINUX_AARCH64("aarch64-unknown-linux-gnu", PossibleTarget.UNIX_64, glibc("aarch64")),
    LINUX_ARM("arm-unknown-linux-gnueabihf", PossibleTarget.UNIX_32_NOT_X86, glibc("arm")),
    WINDOWS_X86_64("x86_64-w64-mingw32", PossibleTarget.WIN_64, "any-windows-any"),
    WINDOWS_X86("i686-w64-mingw32", PossibleTarget.WIN_32, "any-windows-any"),
    MACOS_AARCH64("aarch64-apple-macos", PossibleTarget.UNIX_64, "any-darwin-any"),
    MACOS_X86_64("x86_64-apple-macos", PossibleTarget.UNIX_64, "any-darwin-any");

    private final String triple;
    private final PossibleTarget possibleTarget;
    /** Sub directories of {@code <sysroot>/libc/include}, in search order. */
    private final String[] libcIncludeDirs;

    ParseTarget(String triple, PossibleTarget possibleTarget, String... libcIncludeDirs) {
        this.triple = triple;
        this.possibleTarget = possibleTarget;
        this.libcIncludeDirs = libcIncludeDirs;
    }

    private static String[] glibc(String arch) {
        return new String[] {arch + "-linux-gnu", "generic-glibc", arch + "-linux-any", "any-linux-any"};
    }

    public String getTriple() {
        return triple;
    }

    public PossibleTarget getPossibleTarget() {
        return possibleTarget;
    }

    public String[] clangArguments(Path sysroot) {
        List<String> args = new ArrayList<>();
        args.add("--target=" + triple);
        args.add("-nostdinc");
        args.add("-isystem");
        args.add(sysroot.resolve("include").toString());
        for (String dir : libcIncludeDirs) {
            args.add("-isystem");
            args.add(sysroot.resolve("libc").resolve("include").resolve(dir).toString());
        }
        return args.toArray(new String[0]);
    }
}
