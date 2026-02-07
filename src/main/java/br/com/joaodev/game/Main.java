package br.com.joaodev.game;

import java.util.Scanner;

public class Main {

    private static final String P1 = "John";
    private static final String P2 = "Jack";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pencils = readInitialPencils(scanner);
        String currentPlayer = readFirstPlayer(scanner);
        String otherPlayer = otherOf(currentPlayer);

        runGame(scanner, pencils, currentPlayer, otherPlayer);
    }

    private static int readInitialPencils(Scanner scanner) {
        System.out.println("How many pencils would you like to use:");
        while (true) {
            String input = scanner.nextLine().trim();

            if (!isDigitOnly(input)) {
                System.out.println("The number of pencils should be numeric");
                continue;
            }

            int pencils = Integer.parseInt(input);
            if (pencils == 0) {
                System.out.println("The number of pencils should be positive");
                continue;
            }

            return pencils;
        }
    }

    private static boolean isDigitOnly(String s) {
        return s != null && s.matches("\\d+");
    }

    private static String readFirstPlayer(Scanner scanner) {
        System.out.println("Who will be the first (John, Jack):");
        while (true) {
            String name = scanner.nextLine().trim();
            if (!isValidPlayer(name)) {
                System.out.println("Choose between 'John' and 'Jack'");
                continue;
            }
            return name;
        }
    }

    private static boolean isValidPlayer(String name) {
        return P1.equals(name) || P2.equals(name);
    }

    private static String otherOf(String player) {
        return P1.equals(player) ? P2 : P1;
    }

    private static void runGame(Scanner scanner, int pencils, String current, String other) {
        while (pencils > 0) {
            printPencils(pencils);
            printTurn(current);

            int take = readMove(scanner, pencils);
            pencils -= take;

            if (pencils == 0) {
                System.out.println(other + " won!");
                return;
            }

            String tmp = current;
            current = other;
            other = tmp;
        }
    }

    private static void printPencils(int count) {
        System.out.println("|".repeat(count));
    }

    private static void printTurn(String player) {
        System.out.println(player + "'s turn");
    }

    private static int readMove(Scanner scanner, int pencilsLeft) {
        while (true) {
            String moveStr = scanner.nextLine().trim();

            if (!moveStr.matches("[123]")) {
                System.out.println("Possible values: '1', '2' or '3'");
                continue;
            }

            int take = Integer.parseInt(moveStr);
            if (take > pencilsLeft) {
                System.out.println("Too many pencils were taken");
                continue;
            }

            return take;
        }
    }
}
