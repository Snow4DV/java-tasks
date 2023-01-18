package org.example.var18;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,9,7,-3,0,42,308,17};
        System.out.println(longestSortedSequence(arr));
    }


    public static int longestSortedSequence(int[] array) {
        int longestLength = 0;

        int currentSequenceLength = 1;

        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] <= array[i+1]) {
                currentSequenceLength++;
            } else {
                longestLength = Math.max(longestLength, currentSequenceLength);
                currentSequenceLength = 1;
            }
        }

        return Math.max(currentSequenceLength, longestLength);
    }
}
