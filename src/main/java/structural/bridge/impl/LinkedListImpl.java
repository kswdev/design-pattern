package structural.bridge.impl;

import java.util.LinkedList;

public class LinkedListImpl<T> implements AbstractList<T>{

    private LinkedList<T> list;


    public LinkedListImpl() {
        this.list = new LinkedList<>();
    }

    @Override
    public void addElement(T obj) {
        list.add(obj);
    }

    @Override
    public T deleteElement(int i) {
        return list.pop();
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
