package behavioral.visitor.acceptor;

import behavioral.visitor.visitor.Visitor;

public interface Acceptor {
    public abstract void accept(Visitor v);
}