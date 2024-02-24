package structural.decorator.deco;

import structural.decorator.coffee.Coffee;

public class Latte extends Decorator{
    public Latte(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.printf("우유 추가! ");
    }
}
