package structural.decorator;

import structural.decorator.coffee.Coffee;
import structural.decorator.coffee.KeyaCoffee;
import structural.decorator.deco.Latte;
import structural.decorator.deco.MochaCoffee;

public class CoffeeTest {

    public static void main(String[] args) {
        Coffee keyaCoffee = new KeyaCoffee();
        keyaCoffee.brewing();

        System.out.println();

        Coffee keyaLatte = new Latte(keyaCoffee);
        keyaLatte.brewing();

        System.out.println();
        
        Coffee mochaCoffee = new MochaCoffee(new Latte(new KeyaCoffee()));
        mochaCoffee.brewing();
    }
}
