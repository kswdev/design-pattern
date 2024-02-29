package behavioral.observer.observer;

import behavioral.observer.generator.NumberGenerator;

public interface Observer {
    void update(NumberGenerator generator);
}
