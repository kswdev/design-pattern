package behavioral.factory_method;

import behavioral.factory_method.factory.CarFactory;
import behavioral.factory_method.factory.HyundaiCarFactory;
import behavioral.factory_method.product.Car;

public class CarTest {

    public static void main(String[] args) {
        CarFactory factory = new HyundaiCarFactory();
        Car newCar = factory.createCar("sonata");

        System.out.println(newCar);
    }
}
