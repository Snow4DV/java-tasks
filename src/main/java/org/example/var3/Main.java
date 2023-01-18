package org.example.var3;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = Map.of(
                "Kendrick", "Perkins",
                "Hal", "Perkins"
        );
        System.out.println(isUnique(map));
    }

    private static boolean isUnique(Map<String, String> map) {
        List<Map.Entry<String, String>> entries = new ArrayList<>(map.entrySet());
        for (int i = 0; i < entries.size(); i++) {
            for (int j = 0; j < entries.size(); j++) {

                if(i == j) {
                    continue;
                }

                if(entries.get(i).getValue().equals(entries.get(j).getValue())) {
                    return false;
                }
            }
        }
        return true;
    }
}
