package behavioral.observer.generator;


import behavioral.observer.observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class NumberGenerator {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        Iterator<Observer> ir = observers.iterator();

        while (ir.hasNext()) {
            Observer o = ir.next();
            o.update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();
}
