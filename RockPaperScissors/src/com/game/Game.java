package com.game;

import java.util.Scanner;

public class Game {
	private User p;
    private Computer com;
    private int playerWins;
    private int playerLoses;
    private int ties;
    private boolean isRunning = false;
    private Scanner scan;

    public Game() {
        p = new User();
        com = new Computer();
        scan = new Scanner(System.in);
        start();
    }

    private void start() {
        isRunning = true;
        System.out.println("Please, enter your name:");
        p.setName(scan.nextLine());

        while(isRunning) {
            displayScore();
            p.selectChoice();
            com.selectChoice();
            displayChoices();
            displayWinner(decideWinner());
            updateScore(decideWinner());
            playAgain();
        }
    }

    private void displayScore() {
        System.out.println(p.getName());
        System.out.println("----------");
        System.out.println("Wins: " + playerWins);
        System.out.println("Loses: " + playerLoses);
        System.out.println("Ties: " + ties);
        System.out.println("----------");
    }

    private int decideWinner() {
        // 0 - User wins
        // 1 - Computer wins
        // 2 - tie

        if(p.getChoice().equals("ROCK") && com.getChoice().equals("SCISSORS"))
            return 0;
        else if(p.getChoice().equals("PAPER") && com.getChoice().equals("ROCK"))
            return 0;
        else if(p.getChoice().equals("SCISSORS") && com.getChoice().equals("PAPER"))
            return 0;
        else if(com.getChoice().equals("ROCK") && p.getChoice().equals("SCISSORS"))
            return 1;
        else if(com.getChoice().equals("PAPER") && p.getChoice().equals("ROCK"))
            return 1;
        else if(com.getChoice().equals("SCISSORS") && p.getChoice().equals("PAPER"))
            return 1;
        else
            return 2;
    }

    private void displayChoices() {
        System.out.println("User has selected: " + p.getChoice());
        System.out.println("Computer has selected: " + com.getChoice());
    }

    private void displayWinner(int winner) {
        switch(winner) {
            case 0:
                System.out.println("User has won!");
                break;
            case 1:
                System.out.println("Computer has won!");
                break;
            case 2:
                System.out.println("It is a tie!");
        }
    }

    private void playAgain() {
        String choice;
        System.out.println("Do you want to play again? Enter Yes to play again.");
        choice = scan.nextLine();
        if(!(choice.toUpperCase().equals("YES") ))
            isRunning = false;

    }

    private void updateScore(int winner) {
        if(winner == 0)
            playerWins++;
        else if(winner == 1)
            playerLoses++;
        else if(winner == 2)
            ties++;
    }

}
