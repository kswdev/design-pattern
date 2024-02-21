package structural.bridge.impl;

import structural.bridge.list.List;

public interface AbstractList<T> {

    void addElement(T obj);
    T deleteElement(int i);
    int insertElement(T obj, int i);
    T getElement(int i);
    int getElementSize();
}
