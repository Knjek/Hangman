package se.yrgo.classes;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    private Game game;
    Scanner scan;


    public GameTest() {
        String st = "o";
        scan = new Scanner(st);
        game = new Game(scan);

    }

    @Test
    void testAskQuestion() {
        assertEquals('o', game.askQuestion());
    }

    @Test
    void testIsOutOfGuesses() {
        Game game1 = new Game(scan);

        assertFalse(game1.isOutOfGuesses());

        for (int i = game1.getGuessesleft(); i >= 0; i--) {
            game1.checkAnswer('ö');
        }

        assertTrue(game1.isOutOfGuesses());
    }
}

