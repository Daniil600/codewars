package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/***
 * Deadfish has 4 commands, each 1 character long:
 * @i increments the value (initially 0)
 * @d decrements the value
 * @s squares the value
 * @o outputs the value into the return array
 * Invalid characters should be ignored.
 */

public class DeadfishSwim {
    public static int[] parse(String data) {
        // Implement me! :)
        List<Integer> integers = new ArrayList<>();
        String[] arr = data.split("");
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("d")) {
                result--;
            } else if (arr[i].equals("i")) {
                result++;
            } else if (arr[i].equals("s")) {
                result = result*result;
            } else if (arr[i].equals("o")) {
                integers.add(result);
            }
        }
        Integer[] integersArr = integers.toArray(new Integer[0]);
        return Arrays.stream(integersArr).mapToInt(e -> e).toArray();

    }
}


