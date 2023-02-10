package se.yrgo.run;

import se.yrgo.classes.Game;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in);) {
        Game game = new Game(scan);
        game.play();

        }
        //kastar Scanner IOException? minns inte.
        catch (Exception ex) {

        }


        //scanner
        //trycatch
        //instans av game

    }
}
