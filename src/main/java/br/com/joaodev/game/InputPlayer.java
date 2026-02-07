package br.com.joaodev.game;

import java.util.Scanner;

public class InputPlayer {
    private static final String USER = "John";
    private static final String BOT  = "Jack";

    static int readInitialPencils(Scanner scanner) {
        System.out.println("How many pencils would you like to use:");
        while (true) {
            String s = scanner.nextLine().trim();

            if (!Validation.isDigitsOnly(s)) {
                System.out.println("The number of pencils should be numeric");
                continue;
            }

            int n = Integer.parseInt(s);
            if (n == 0) {
                System.out.println("The number of pencils should be positive");
                continue;
            }

            return n;
        }
    }

    static String readFirstPlayer(Scanner scanner) {
        System.out.println("Who will be the first (John, Jack):");
        while (true) {
            String name = scanner.nextLine().trim();
            if (!Validation.isValidPlayer(name, USER, BOT)) {
                System.out.println("Choose between 'John' and 'Jack'");
                continue;
            }
            return name;
        }
    }

    static int readUserMove(Scanner scanner, int pencilsLeft) {
        while (true) {
            String s = scanner.nextLine().trim();

            if (!Validation.isMove1to3(s)) {
                System.out.println("Possible values: '1', '2' or '3'");
                continue;
            }

            int take = Integer.parseInt(s);
            if (take > pencilsLeft) {
                System.out.println("Too many pencils were taken");
                continue;
            }

            return take;
        }
    }
}
