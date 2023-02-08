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
        control = new Controller();
        guessesleft = 8;

    }

    public void play() {

        while (true) {
            System.out.print("Guess one letter: ");

            if (correctWord.equals(Controller.getGuess())) {
                System.out.println("You did it! " + correctWord + " was the word I was looking for.");
                break;
            }
            else {
                
            }

        }
        //konstruktor som tar emot en scanner.
        //instans av controller & reader
        // sout om välkommen till hangman
        //metod för att gissa en bokstav
        //while loopen
    /*
    guesses left
    guesses--
     */

    }
