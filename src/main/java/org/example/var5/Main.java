package org.example.var5;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> string = new ArrayList<>();
        string.add("dsa");
        string.add("dse");
        string.add("dsa");
        Map<String, Integer> map = new HashMap<>();
        map.put("Alyssa", 22);
        map.put("Char",25);
        map.put("Dan",25);
        map.put("Jeff",20);
        map.put("Kasey",20);
        map.put("Kim",20);
        map.put("Morgan",25);
        map.put("Ryan",25);
        map.put("Stef",22);
        System.out.println(rarest(map));
            int a = 0;
    }

    private static Integer rarest(Map<String, Integer> map) {
        Stream<Map.Entry<String, Integer>> stream = map.entrySet().stream();
        Map.Entry<String, Integer> rarestEntry = stream.sorted((o1, o2) -> {
            long countObj1 = map.entrySet().stream().filter(stringIntegerEntry -> Objects.equals(stringIntegerEntry.getValue(),
                    o1.getValue())).count();
            long countObj2 = map.entrySet().stream().filter(stringIntegerEntry -> Objects.equals(stringIntegerEntry.getValue(),
                    o2.getValue())).count();
            return (int) (countObj1 - countObj2);
        }).findFirst().orElse(null);

        if(rarestEntry == null) {
            throw new IllegalArgumentException(); // useless
        } else {
            return rarestEntry.getValue();
        }
    }
}
