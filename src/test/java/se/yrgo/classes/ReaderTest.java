package se.yrgo.classes;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ReaderTest {
    List<String> wordList = new ArrayList<>();
    wordList.add("bok");
    
@Test
    void testRemoveWords(){
    List<String> list = new ArrayList<>();
    
    
    System.out.println(list);
    
    List<String> correctList = new ArrayList<>();
    for(String word : list){
        if(word.contains("å") || word.contains("ä") || word.contains("ö")){
        
        }
    }
    
    }
}
