package br.com.joaodev.game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pencils = InputPlayer.readInitialPencils(sc);
        String first = InputPlayer.readFirstPlayer(sc);

        Game game = new Game(pencils, first);
        game.play(sc);
    }
}
