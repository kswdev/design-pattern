package behavioral.observer.observer;

import behavioral.observer.generator.NumberGenerator;

public class DigitObserver implements Observer{

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitGenerator:" + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
