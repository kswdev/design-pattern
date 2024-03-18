package behavioral.iterator.factory;

import behavioral.iterator.collection.Aggregate;
import behavioral.iterator.iterator.Iterator;

public abstract class Factory {
    public final Iterator create(Aggregate list, int type) {
        return createProduct(list, type);
    }
    protected abstract Iterator createProduct(Aggregate list, int type);
}
