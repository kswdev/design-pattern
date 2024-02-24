package structural.decorator.deco;

import structural.decorator.coffee.Coffee;

public class MochaCoffee extends Decorator{
    @Override
    public void brewing() {
        super.brewing();
        System.out.printf("모카 추가! ");
    }

    public MochaCoffee(Coffee coffee) {
        super(coffee);
    }
}
