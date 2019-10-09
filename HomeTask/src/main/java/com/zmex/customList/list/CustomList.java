package com.zmex.customList.list;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Function;

public class CustomList<T extends Number> implements Serializable, Cloneable {

    private static final long serialVersionUID = -1405017324285483990L;
    private static final int DEFAULT_LIST_CAPACITY = 15;
    private static final Object[] DEFAULT_ARRAY = new Object[DEFAULT_LIST_CAPACITY];
    private int elementCounter;
    private Object[] DATA_ARRAY;

    public CustomList() {
        DATA_ARRAY = DEFAULT_ARRAY;
    }

    public CustomList(int capacity) {
        if (capacity == 0) {
            DATA_ARRAY = DEFAULT_ARRAY;
        } else if (capacity > 0) {
            DATA_ARRAY = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Illegal capacity " + capacity);
        }

    }

    private CustomList(Object [] numbers) {
        DATA_ARRAY = numbers;
    }

    private void checkCapacity() {
        if (DATA_ARRAY.length == elementCounter) {
            DATA_ARRAY = Arrays.copyOf(DATA_ARRAY, DATA_ARRAY.length * 2);
        }
    }

    private boolean checkIndex(int index) {
        if (index < 0 || index >= elementCounter) {
            return false;
        } else {
            return true;
        }
    }

    private void checkArraySize() {
        if (DATA_ARRAY.length / 2 > elementCounter) {
            DATA_ARRAY = Arrays.copyOfRange(DATA_ARRAY, 0, DATA_ARRAY.length / 2);
        }
    }

    public boolean add(T number) {
        checkCapacity();
        elementCounter++;
        DATA_ARRAY[elementCounter - 1] = number;
        return true;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (checkIndex(index)) {
            return (T) DATA_ARRAY[index];
        }
        throw new IndexOutOfBoundsException();
    }

    @SuppressWarnings("unchecked")
    public T remove(int index) {
        if (checkIndex(index)) {
            T value = (T) DATA_ARRAY[index];
            elementCounter--;
            System.arraycopy(DATA_ARRAY, index + 1, DATA_ARRAY, index, DATA_ARRAY.length - index - 1);
            checkArraySize();
            return value;
        } else {
            throw new IndexOutOfBoundsException();
        }

    }

    public <R extends Number> CustomList<R> map(Function<T, R> function) {
        DATA_ARRAY = Arrays.stream(DATA_ARRAY).filter(Objects::nonNull).map(x -> function.apply((T) x)).toArray();
        return (CustomList<R>) this;
    }

    public Iterator<T> iterator() {
        return new CustomIterator<>();
    }

    public int size() {
        return elementCounter;
    }

    @SuppressWarnings({"hiding"})
    private class CustomIterator<T> implements Iterator<T> {

        int size = elementCounter;
        int currentPosition = 0;

        @Override
        public boolean hasNext() {
            if (currentPosition < size) {
                return true;
            }
            return false;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            @SuppressWarnings("unchecked")
            T value = (T) DATA_ARRAY[currentPosition];
            currentPosition++;
            return value;
        }

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < elementCounter; i++) {
            builder.append(DATA_ARRAY[i]);
            if (i == elementCounter - 1) {
                break;
            }
            builder.append(", ");
        }
        builder.append("]");
        return builder.toString();
    }

}
