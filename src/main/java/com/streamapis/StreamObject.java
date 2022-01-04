package com.streamapis;

import java.util.*;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        // Create a Stream
//        Stream<String> stringStream = Stream.of("Apple", "Orange", "Grapes");
//        System.out.println("Creation of Stream");
//        stringStream.forEach(System.out::println);

        // Create a Stream from different sources
        Collection<String> stringCollection = Arrays.asList("BMW", "Maruti", "Tesla");
        Stream<String>collectionStream = stringCollection.stream();
        System.out.println("Creation of Stream using Collection");
        collectionStream.forEach(System.out::println);

        List<String> stringList = Arrays.asList("One", "Two", "Three");
        Stream<String>listStream = stringList.stream();
        System.out.println("Creation of Stream using List");
        listStream.forEach(System.out::println);

        Set<String> stringSet = new HashSet<>(stringList);
        Stream<String>setStream = stringSet.stream();
        System.out.println("Creation of Stream using Set");
        setStream.forEach(System.out::println);

        String[] stringArray = {"A", "B", "C"};
        Stream<String>arrayStream = Arrays.stream(stringArray);
        System.out.println("Creation of Stream using Array");
        arrayStream.forEach(System.out::println);
        System.out.println();
    }
}
