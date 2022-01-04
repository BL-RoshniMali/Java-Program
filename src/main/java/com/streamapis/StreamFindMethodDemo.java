package com.streamapis;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamFindMethodDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 4, 5, 9, 4);

        //findFirst() and findAny() method
        Optional<Integer> element = list.stream().findFirst();
        if (element.isPresent()){
            System.out.println(element.get());
        }else
            System.out.println("Stream is empty");

        Optional<Integer> element1 = list.stream().findAny();
        if (element1.isPresent()){
            System.out.println(element1.get());
        }else
            System.out.println("Stream is empty");

        // count(), min() and max() method
        Stream<Integer> stream = Stream.of(34, 56, 23, 11, 89, 68);
        System.out.println(stream.count());

        Integer minValue = Stream.of(34, 56, 23, 11, 89, 68).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min Value: "+minValue);

        Integer maxValue = Stream.of(34, 56, 23, 11, 89, 68).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max Value: "+maxValue);
    }
}
