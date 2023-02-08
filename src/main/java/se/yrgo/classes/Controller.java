package se.yrgo.classes;

import java.util.Arrays;

public class Controller {
    // lista över använda bokstäver
    // rätt ord från Reader
    private char[] correctWord;
    private char[] blankWord;

    public Controller (String correctWord) {
        this.correctWord = correctWord.toCharArray();
        makeBlank(correctWord);
    }

    public void checkLetter(char c) {
        for (int i = 0; i < correctWord.length; i++) {
            if (c == correctWord[i]) {
                blankWord[i] = c;
            }
        }
    }
    private void makeBlank(String word) {
        blankWord = new char[word.length()];
        Arrays.fill(blankWord, '_');
    }


    // stjärn-ord (skapa)
    // guessed char från Game

    // metod för att returnera stjärn-ordet som sträng
    //

    // fel bokstav
    // // redan använd bokstav
    // rätt bokstav
    // färdig
}
