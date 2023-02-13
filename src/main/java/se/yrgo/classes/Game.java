package se.yrgo.classes;

import java.util.Scanner;

public class Game {

    private int guessesleft;

    private Controller control;
    private Reader read;
    private Scanner scan;
    private String correctWord;


    public Game(Scanner scan) {
        this.scan = scan;
        read = new Reader();
        correctWord = "test";
        control = new Controller(correctWord);
        guessesleft = 8;

    }

    public void play() {

        while (true) {
            char guess = askQuestion();

            checkAnswer(guess);

            if (isWon()) break;

            if (isOutOfGuesses()) break;
        }

    }

    private char askQuestion() {
        System.out.print("Guess one letter: ");
        char guess = scan.nextLine().charAt(0);
        return guess;
    }

    public void checkAnswer(char guess) {
        if (control.checkLetter(guess)) {
            System.out.println("You got one! gimmie another one");
            System.out.println(control.getLatestGuessedWord());

        } else {
            System.out.println("Wrong guess, try again");
            System.out.println(control.getLatestGuessedWord());
            guessesleft--;
        }
    }

    public boolean isOutOfGuesses() {
        if (guessesleft <= 0) {
            System.out.println("No guesses left, u suck");
            return true;
        }
        return false;
    }

    public boolean isWon() {
        if (correctWord.equals(control.getLatestGuessedWord())) {
            System.out.println("You did it! " + correctWord + " was the word I was looking for.");
            return true;
        }
        return false;
    }


    public int getGuessesleft() {
        return guessesleft;
    }

    public String getCorrectWord() {
        return correctWord;
    }
}
