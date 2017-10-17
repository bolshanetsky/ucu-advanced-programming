package com.ucu.assignments.assignment1.guessgame;

import javax.swing.*;
import java.util.Random;

public class GuessGame {

    // Run me :)
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.start();
    }

    private final static String START_GAME_MESSAGE = "Please enter the maximum number to guess";
    private final static String GUESS_NUMBER_MESSAGE = "Please enter your guess";
    private final static String DO_YOU_WANT_ONE_MORE_ROUND = "Do you want one more round?";
    private boolean gameEnded;
    private int bestScore;

    /**
     * Asks for the initial value and starts the game.
     */
    private void start() {
        int maxNumber = 0;

        try {
            maxNumber = Integer.parseInt(JOptionPane.showInputDialog(START_GAME_MESSAGE));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "You have entered not a number or it is to big");
            start();
        }

        play(maxNumber);
    }

    /**
     * Plays the game
     *
     * @param max - maximum number to guess
     */
    private void play(int max) {
        int tries = 0;
        int secretNumber = new Random().nextInt(max);
        JOptionPane.showMessageDialog(null, "LET THE BATTLE BEGIN!");

        while (!isGameEnded()) {
            tries++;
            int guessNumber;

            try {
                guessNumber = Integer.parseInt(JOptionPane.showInputDialog(GUESS_NUMBER_MESSAGE));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "You have entered not a number or it is to big");
                continue;
            }

            if (guessNumber > secretNumber) {
                JOptionPane.showMessageDialog(null, "TOO BIG!");
            } else if (guessNumber < secretNumber) {
                JOptionPane.showMessageDialog(null, "TOO SMALL!");
            } else if (guessNumber == secretNumber) {
                JOptionPane.showMessageDialog(null, "BINGOOOOO!");
                updateBestScore(max, tries);
                endGameDialog();
                secretNumber = new Random().nextInt(max);
                tries = 0;
            }
        }
    }

    /**
     * Asks player if she wan't to continue.
     */
    private void endGameDialog() {
        int reply = JOptionPane.showConfirmDialog(null, DO_YOU_WANT_ONE_MORE_ROUND, "title", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.NO_OPTION) {
            printBestScore();
            setGameEnded(true);
        }
    }

    /**
     * Prints the best score.
     */
    private void printBestScore() {
        JOptionPane.showMessageDialog(null, "BEST SCORE: " + getBestScore());
    }

    /**
     * Updates the best score if it's greater.
     *
     * @param maxNumber - max guessed number.
     * @param tries     - count of guess tries.
     */
    private void updateBestScore(int maxNumber, int tries) {
        int currentScore = maxNumber / tries;

        if (currentScore > bestScore) {
            setBestScore(currentScore);
        }
    }

    // Getters ans Setters

    public void setGameEnded(boolean gameEnded) {
        this.gameEnded = gameEnded;
    }

    public void setBestScore(int bestScore) {
        this.bestScore = bestScore;
    }

    public boolean isGameEnded() {
        return gameEnded;
    }

    public int getBestScore() {
        return bestScore;
    }
}
