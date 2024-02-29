package behavioral.observer;

import behavioral.observer.generator.NumberGenerator;
import behavioral.observer.generator.RandomNumberGenerator;
import behavioral.observer.observer.DigitObserver;
import behavioral.observer.observer.GraphObserver;
import behavioral.observer.observer.Observer;

public class ObserverTest {

    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}
