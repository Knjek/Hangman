package se.yrgo.classes;

public class Controller {
    // lista över använda bokstäver
    // rätt ord från Reader
    private char[] correctWord;
    private char[] blankWord;

    public Controller (String correctWord) {
        this.correctWord = correctWord.toCharArray();
    }

    public String checkLetter(char c) {
        for (int i = 0; i < correctWord.length; i++) {
            if (c == correctWord[i]) {
                blankWord[i] = c;
            }
        }
        return String.valueOf(blankWord);
    }
    private static void makeBlank() {

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
