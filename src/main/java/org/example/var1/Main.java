package org.example.var1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
    private static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
        List<Integer> alternated = new ArrayList<>();
        while(list1.size() > 0 && list2.size() > 0) {
            alternated.add(list1.get(0));
            alternated.add(list2.get(0));
            list1.remove(0);
            list2.remove(0);
        }

        alternated.addAll(list1.size() > 0 ? list1 : list2);
        return alternated;
    }
}
