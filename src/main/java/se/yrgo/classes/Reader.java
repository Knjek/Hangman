package se.yrgo.classes;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/*

    läser in en fil och slumpar fram ett ord.
    ett string fält med typ wordToGuess med tillhörande getter

    returnerar ett ord i gemener,
    orden får inte vara för korta eller för långa

    tar bort alla ord som innehåller å ä ö, bindestreck osv


     */
public class Reader {
    private List<String> words = new ArrayList<>();
    private Random random = new Random();
    
    public Reader() {
        Path wordList = FileSystems.getDefault().getPath("assets","words.txt");
        
        try (BufferedReader reader = Files.newBufferedReader(wordList)) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.length() > 3 && line.length() < 11) {
                    words.add(line.toLowerCase());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public List<String> removeWords(){
        List<String> faultyWords = new ArrayList<>();
        
        for (String word : words) {
            if (word.contains("å") || word.contains("ä") || word.contains("ö")) {
                faultyWords.add(word);
            }
        }
        words.removeAll(faultyWords);
        
        return words;
    }
    
    public String randWord() {
        return words.get(random.nextInt(words.size()));
    }
    
    
}


