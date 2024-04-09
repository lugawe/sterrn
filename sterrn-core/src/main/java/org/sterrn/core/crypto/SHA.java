package org.sterrn.core.crypto;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;

public final class SHA {

    private static final HashFunction fnc = Hashing.sha256();

    private SHA() {
    }

    public static byte[] hash(byte[] input) {
        return fnc.hashBytes(input).asBytes();
    }

    public static String hash(String input) {
        return fnc.hashString(input, StandardCharsets.UTF_8).toString();
    }

}
