package br.com.joaodev.game;

public class OutputPlayer {
    private static final String USER = "John";
    private static final String BOT  = "Jack";

    static void printPencils(int count) {
        System.out.println("|".repeat(count));
    }

    static void printUserTurn() {
        System.out.println(USER + "'s turn!");
    }

    static void printBotTurn() {
        System.out.println(BOT + "'s turn:");
    }
}
