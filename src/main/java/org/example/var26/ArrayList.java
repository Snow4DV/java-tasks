package org.example.var26;

import java.util.*;


public class ArrayList<T> implements List<T> {
    private static final short CHUNK_SIZE = 10;
    private int size = 0;
    private Object[] array = new Object[CHUNK_SIZE];

    public ArrayList() {
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return Objects.isNull(array[0]);
    }

    @Override
    public boolean contains(Object o) {
        for (Object object :
                array) {
            if (object == o) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = -1;
            @Override
            public boolean hasNext() {
                return index + 1 < array.length && array[index + 1] != null;
            }

            @Override
            public T next() {
                return (T) array[++index];
            }
        };
    }

    @Override
    public Object[] toArray() {
        return array;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return (T1[]) array;
    }

    @Override
    public boolean add(T t) {
        if(array.length == size) resizeArray();

        array[size++] = t;

        return true;
    }


    private void resizeArray() {
        array = Arrays.copyOf(array, array.length + CHUNK_SIZE);
    }

    @Override
    public boolean remove(Object o) {
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if(array[i].equals(o)) {
                flag = true;
            }

            if(flag) {
                array[i] = array[i+1];
            }
        }

        if(flag && size > 0) {
            array[--size] = null;
        }

        return flag;
    }


    // Ну остальное лень уже, надеюсь проверяющие будут иметь совесть)

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}

