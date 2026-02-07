package br.com.joaodev.game;

public class Validation {
    static boolean isDigitsOnly(String s) {
        return s != null && s.matches("\\d+");
    }

    static boolean isMove1to3(String s) {
        return s != null && s.matches("[123]");
    }

    static boolean isValidPlayer(String name, String p1, String p2) {
        return p1.equals(name) || p2.equals(name);
    }
}
