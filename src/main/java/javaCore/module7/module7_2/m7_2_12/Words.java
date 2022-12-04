package javaCore.module7.module7_2.m7_2_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Words {

    public static void main(String[] args) {

        new BufferedReader(new InputStreamReader(System.in)).lines()
                .map(x -> x.split("[^a-zA-Zа-яёА-ЯЁ0-9]"))
                .flatMap(Arrays::stream).map(x -> x.toLowerCase()
                        .replaceAll("[^a-zA-Zа-яёА-ЯЁ0-9]", " ")
                        .replaceAll(" ", "")).filter(x -> !x.equals(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted((o1, o2) -> {
                    return o2.getValue().compareTo(o1.getValue());
                }).sorted((o1, o2) -> {
                    return (o2.getValue() == o1.getValue()) ? o1.getKey().compareTo(o2.getKey()) : 0;
                })
                .limit(10).map(Map.Entry::getKey)
                .forEach(n -> System.out.println(n));

    }
}
