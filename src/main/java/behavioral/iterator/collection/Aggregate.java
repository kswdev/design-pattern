package behavioral.iterator.collection;

import behavioral.iterator.iterator.Iterator;

public interface Aggregate {
    Iterator iterator(int type);
    int getLength();

}
