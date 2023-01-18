package org.example.var25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Stack<T> {
    private List<T> list;
    public Stack() {
        list = new LinkedList<>();
    }

    public void push(T object) {
        list.add(object);
    }

    public T pop() {
        T t = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return t;
    }

    public T peek() {
        return list.get(list.size() - 1);
    }

}
