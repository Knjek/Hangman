package se.yrgo.classes;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControllerTest {
    private String correctWord;
    Controller c;

    public ControllerTest() {
        correctWord = "apa";
        c = new Controller(correctWord);
    }

    @Test
    public void makeBlankTest() {
        String blank  = c.getLatestGuessedWord(); //should be blank
        assertEquals(blank, "***");
        assertNotEquals(blank, "apa");
    }

    @Test
    public void checkLetterReturnTest() {
        c = new Controller(correctWord);
        assertTrue(c.checkLetter('a'));
        assertFalse(c.checkLetter('b'));
    }

    @Test
    public void checkLetterReplaceBlankTest() {
        c = new Controller(correctWord);
        String blank = c.getLatestGuessedWord(); // should be "***"

        c.checkLetter('p');
        String notBlank = c.getLatestGuessedWord(); // should be "*p*"

        assertEquals(notBlank, "*p*");
        assertNotEquals(blank, notBlank);

        c.checkLetter('a'); //checking that last added letter is not replaced
        assertEquals("apa", c.getLatestGuessedWord());
    }
}
