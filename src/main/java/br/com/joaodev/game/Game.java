package br.com.joaodev.game;

import java.util.Scanner;

public class Game {
    private int pencils;
    private String current;

    private static final String USER = "John";
    private static final String BOT  = "Jack";

    Game(int pencils, String firstPlayer) {
        this.pencils = pencils;
        this.current = firstPlayer;
    }

    void play(Scanner scanner) {
        while (pencils > 0) {
            OutputPlayer.printPencils(pencils);

            if (BOT.equals(current)) {
                OutputPlayer.printBotTurn();
                int take = Bot.chooseMove(pencils);
                System.out.println(take);
                pencils -= take;

                if (pencils == 0) {
                    System.out.println(USER + " won!");
                    return;
                }

                current = USER;
            } else {
                OutputPlayer.printUserTurn();
                int take = InputPlayer.readUserMove(scanner, pencils);
                pencils -= take;

                if (pencils == 0) {
                    System.out.println(BOT + " won!");
                    return;
                }

                current = BOT;
            }
        }
    }
}
