package com.game;

import java.util.Random;

public class Computer extends Player {
    private Random rand;
    private final int MAX_NUMBER = 3;

    public Computer() {
        setName("Computer");
        rand = new Random();
    }

    public void selectChoice() {
        int randomNumber = rand.nextInt(MAX_NUMBER);
        switch(randomNumber) {
            case 0:
                setChoice("ROCK");
                break;
            case 1:
                setChoice("PAPER");
                break;
            case 2:
                setChoice("SCISSORS");
                break;
        }
    }
}
