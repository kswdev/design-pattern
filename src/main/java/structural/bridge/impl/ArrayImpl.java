package structural.bridge.impl;

import java.util.ArrayList;

public class ArrayImpl<T> implements AbstractList<T> {

    private ArrayList<T> list = new ArrayList<>();

    @Override
    public void addElement(T obj) {
        list.add(obj);
    }

    @Override
    public T deleteElement(int i) {
        return list.remove(i);
    }

    @Override
    public int insertElement(T obj, int i) {
        list.add(i, obj);
        return i;
    }

    @Override
    public T getElement(int i) {
        return list.get(i);
    }

    @Override
    public int getElementSize() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
