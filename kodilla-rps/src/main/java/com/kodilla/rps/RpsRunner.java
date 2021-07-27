package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {
        while (!Game.getInstance().isFinished()) {
            Game.getInstance().intro();
            Game.getInstance().getMatchWinner();
        }
    }
}
