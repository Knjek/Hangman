package se.yrgo.classes;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    private Controller controll;
    private Game game;


    public GameTest(){
        String st = "o";
        try(Scanner scan = new Scanner(st)) {
        game = new Game(scan);

        }
        controll = new Controller("test");

    }


    @Test
    void testIsOutOfGuesses() {
        assertFalse(game.isOutOfGuesses());

        for (int i = game.getGuessesleft(); i >= 0  ; i--) {
            game.checkAnswer('o');
        }

        assertTrue(game.isOutOfGuesses());


    }
}
