package org.example.var21;

import java.util.List;

public abstract class Searcher<T> {
    public abstract int find(List<Comparable<T>> list, T object);
}
