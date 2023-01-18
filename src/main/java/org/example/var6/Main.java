package org.example.var6;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.TreeMultiset;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"Farm", "Zoo", "Car", "Apple", "Bee", "Golf", "Bee", "Dog", "Golf", "Zoo", "Zoo", "Bee", "Bee", "Apple"};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(guavaSort(arr)));
    }


    private static String[] guavaSort(String[] array) {
        Multiset<String> multiset = TreeMultiset.create();
        multiset.addAll(Arrays.asList(array));
        array = new String[multiset.entrySet().size()];

        int i = 0;
        for (Multiset.Entry<String> entry :
                multiset.entrySet()) {
            array[i++] = entry.getElement() + (entry.getCount() > 1 ? " x " + entry.getCount() : "");
        }

        return array;
    }
}
