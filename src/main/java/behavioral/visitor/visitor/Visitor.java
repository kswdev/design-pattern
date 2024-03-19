package behavioral.visitor.visitor;

import behavioral.visitor.acceptor.entiry.Directory;
import behavioral.visitor.acceptor.entiry.File;

public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}