package org.example.var4;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

    }

    private static boolean hasOdd(Set<Integer> set) {
        for (Integer num :
                set) {
            if(num%2==1) {
                return true;
            }
        }

        return false;
    }
}
