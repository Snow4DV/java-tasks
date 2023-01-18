package org.example.var21;

import java.util.Iterator;
import java.util.List;

public class StraightSearcher<T> extends  Searcher<T> {
    @Override
    public int find(List<Comparable<T>> list, T object) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).compareTo(object) == 0) {
                return i;
            }
        }
        return -1;
    }
}
