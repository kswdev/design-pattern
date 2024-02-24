package structural.decorator.deco;

import structural.decorator.coffee.Coffee;

public abstract class Decorator extends Coffee {

    private final Coffee coffee;

    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {

        coffee.brewing();
    }
}
