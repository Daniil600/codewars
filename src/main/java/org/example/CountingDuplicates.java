package org.example;

import java.nio.CharBuffer;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        long max = text.toLowerCase().chars()
                .mapToObj(character -> (char) character)
                .collect(Collectors.toMap(
                        k -> k,
                        v -> 1,
                        Integer::sum,
                        TreeMap::new
                ))
                .values()
                .stream()
                .filter(i -> i > 1).count();
        return (int) max;

    }
}
