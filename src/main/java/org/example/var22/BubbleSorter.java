
package org.example.var22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubbleSorter extends Sorter<Integer>{
    public BubbleSorter(List<Integer> unsortedObjects) {
        super(unsortedObjects);
    }

    @Override
    public List<Integer> sort() {
        for(int i = 0; i < comparables.size(); i++) {
            for(int j = 0; j < comparables.size() - i; j++) {
                if(comparables.get(j + 1).compareTo(comparables.get(j)) > 0) {
                    Collections.swap(comparables, i, j);
                }
            }
        }
        return comparables;
    }
}
         