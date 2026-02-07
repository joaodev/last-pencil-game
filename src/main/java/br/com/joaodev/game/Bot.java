package br.com.joaodev.game;

public class Bot {
    static int chooseMove(int pencilsLeft) {
        int mod = pencilsLeft % 4;

        if (mod == 0) return 3;
        if (mod == 3) return 2;

        return 1;
    }
}
