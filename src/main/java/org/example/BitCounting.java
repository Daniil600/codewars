package org.example;


import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation
 * of that number. You can guarantee that input is non-negative.
 * Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case*/
public class BitCounting {
    public static int countBits(int n){
        //transform to String
        String str = Integer.toBinaryString(n);
        //Creat patern for checks
        Pattern pattern = Pattern.compile("^[0-1]*$");
        Matcher matcher = pattern.matcher(str);
        System.out.println(str);
        if(matcher.matches()){
            return StringUtils.countMatches(str, "1");
        }
        else {
            return 0;
        }
    }
}
