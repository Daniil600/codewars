package org.example;

import java.util.Arrays;

public class NumberUtils {
    public static boolean isNarcissistic(int number) {
        return Arrays.stream(String.valueOf(number).split(""))
                .mapToInt(Integer::parseInt)
                .map(i -> (int) Math.pow(i, String.valueOf(number).length()))
                .sum() == number;
    }
}
