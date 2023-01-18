package org.example.var29;

import java.util.Arrays;

public class Stack<T> {
    private T[] array;


    private static final int CHUNK = 10;
    private int length = 0;

    public Stack() {
        array = (T[]) new Object[CHUNK];
    }

    public void push(T object) {
        if(length == array.length) {
            resizeArray();
        }

        array[length++] = object;
    }

    public T pop() {
        return array[length-- - 1];
    }

    public T peek() {
        return array[length-1];
    }

    private void resizeArray() {
        array = Arrays.copyOf(array, array.length + CHUNK);
    }
}
