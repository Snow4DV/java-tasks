package org.example.var22;


import java.util.ArrayList;
import java.util.List;

public abstract class Sorter<T extends Comparable<T>> {
    protected final List<T> comparables;

    public Sorter(List<T> unsortedObjects) {
        this.comparables = unsortedObjects;
    }

    public abstract List<T> sort();

    private int compare(T t1, T t2) {
        return t1.compareTo(t2);
    }

}
