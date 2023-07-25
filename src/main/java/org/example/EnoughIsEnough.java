package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        //Bad practice
        Map<Integer, Integer> occurrence = new HashMap<>();
        return IntStream.of(elements)
                .filter(motif -> occurrence.merge(motif, 1, Integer::sum) <= maxOccurrences)
                .toArray();
//        if(maxOccurrences <=0){
//            return new int[]{};
//        }
//        Map<Integer, Long> map = Arrays.stream(elements).boxed()
//                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting())).
//                entrySet().stream().peek(e -> e.setValue(e.getValue() - maxOccurrences))
//                .filter(element -> element.getValue() >= 1)
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//
//        List<Integer> integerList = Arrays.stream(elements).boxed().collect(Collectors.toList());
//
//        for (int i = elements.length - 1; i >= 0; i--) {
//            for (Map.Entry<Integer, Long> entry : map.entrySet()) {
//                if (elements[i] == entry.getKey()) {
//                    if (entry.getValue() == 0) {
//                        map.remove(entry.getKey());
//                        break;
//                    }
//                    entry.setValue(entry.getValue() - 1);
//                    integerList.remove(i);
//                }
//
//            }
//        }
//        return integerList.stream().mapToInt(Integer::intValue).toArray();
    }
}
