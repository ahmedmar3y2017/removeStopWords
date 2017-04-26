/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ahmed
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
String s="I love this phone, its super fast and there's so" +
            " much new and cool things with jelly bean....but of recently I've seen some bugs.";
    String[] words = s.split(" ");
    ArrayList<String> wordsList = new ArrayList<String>();
    Set<String> stopWordsSet = new HashSet<String>();
    stopWordsSet.add("I");
    stopWordsSet.add("THIS");
    stopWordsSet.add("AND");
    stopWordsSet.add("THERE'S");

    for(String word : words)
    {
        String wordCompare = word.toUpperCase();
        if(!stopWordsSet.contains(wordCompare))
        {
            wordsList.add(word);
        }
    }

    for (String str : wordsList){
        System.out.print(str+" ");
    }    }
    
}
