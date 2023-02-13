package se.yrgo.classes;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ReaderTest {
    
@Test
    void testRemoveWords(){
    List<String> list = new ArrayList<>();
    list.add("bok");
    list.add("kåk");
    list.add("hus");
    list.add("kärlek");
    list.add("överhuvud");
    
    assertTrue(list.size() == 5);
    
    List<String> inCorrectList = new ArrayList<>();
    for(String word : list){
        if(word.contains("å") || word.contains("ä") || word.contains("ö")){
            inCorrectList.add(word);
        }
    }
    list.removeAll(inCorrectList);
    
    assertTrue(list.size() ==2);
    }
    
}
