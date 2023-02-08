package se.yrgo.classes;

import java.util.Arrays;

public class Controller {
    // lista över använda bokstäver
    // rätt ord från Reader
    private char[] correctWord;
    private char[] blankWord;
    private String latestGuessedWord;

    public Controller (String correctWord) {
        this.correctWord = correctWord.toCharArray();
        makeBlank(correctWord);
        latestGuessedWord = String.valueOf(blankWord);
    }

    public boolean checkLetter(char c) {
        boolean isCorrect = false;
        for (int i = 0; i < correctWord.length; i++) {
            if (c == correctWord[i]) {
                blankWord[i] = c;
                isCorrect = true;
            }
        }
        latestGuessedWord = String.valueOf(blankWord);
        return isCorrect;
    }
    private void makeBlank(String word) {
        blankWord = new char[word.length()];
        Arrays.fill(blankWord, '*');
    }

    public String getLatestGuessedWord() {
        return latestGuessedWord;
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
