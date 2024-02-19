package behavioral.factory_method.factory;

import behavioral.factory_method.product.Car;
import behavioral.factory_method.product.Santafe;
import behavioral.factory_method.product.Sonata;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HyundaiCarFactory extends CarFactory{

    Map<String, Car> carMap = new HashMap<>();

    @Override
    public Car createCar(String name) {
        Car car = null;

        if (Objects.equals(name, "sonata"))
            car = new Sonata();
        else if (Objects.equals(name, "santafe"))
            car = new Santafe();

        return car;
    }

    @Override
    public Car returnCar(String name) {
        Car car = carMap.get(name);

        if (car == null) {
            if (name.equals("Tomas"))
                car = new Sonata();
            else if (name.equals("James"))
                car = new Santafe();

            carMap.put(name, car);
        }

        return car;
    }
}
