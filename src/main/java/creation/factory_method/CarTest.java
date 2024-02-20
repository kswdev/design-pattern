package creation.factory_method;

import creation.factory_method.factory.CarFactory;
import creation.factory_method.factory.HyundaiCarFactory;
import creation.factory_method.product.Car;

public class CarTest {

    public static void main(String[] args) {
        CarFactory factory = new HyundaiCarFactory();
        Car newCar = factory.createCar("sonata");

        System.out.println(newCar);
    }
}
