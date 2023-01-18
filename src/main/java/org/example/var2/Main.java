package org.example.var2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    }


    private static Map<String, Integer> reverse(Map<Integer, String> map) {
        Map<String, Integer> reverseMap = new HashMap<>();

        for (Map.Entry<Integer, String> entry :
                map.entrySet()) {
            reverseMap.put(entry.getValue(), entry.getKey());
        }

        return reverseMap;
    }
}
