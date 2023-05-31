package org.example;


import java.util.*;
import java.util.stream.Collectors;

/**
 * A pangram is a sentence that contains every single letter of the alphabet at least once.
 * For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
 * because it uses the letters A-Z at least once (case is irrelevant).
 * <br>
 * <br>Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
 *
 *
 * */
public class DetectPangram {
    public boolean check(String sentence){

        //This creates a char array with lowercase letters and only letters
        char[] characters = sentence.toLowerCase().replaceAll("[^a-z]", "").toCharArray();

        //Creates a SortedSet for unique values
        SortedSet<Character> sortedSet = new TreeSet<>();

        //add characters to sortedSet
        for (char c : characters) {
            sortedSet.add(c);
        }

        //Check by the number of letters in the English alphabet
       if(sortedSet.size() != 26){
           return false;
       }else {
           return true;
       }
    }

}
