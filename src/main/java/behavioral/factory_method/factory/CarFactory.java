package behavioral.factory_method.factory;

import behavioral.factory_method.product.Car;

public abstract class CarFactory {
    public abstract Car createCar(String name);
    public abstract Car returnCar(String name);

    public void numbering() {
        System.out.println("numbering");
    }

    public void washCar() {
        System.out.println("washCar");
    }

    public final void sellCar(String name) {
        numbering();
        createCar(name);
        washCar();
    }
}
