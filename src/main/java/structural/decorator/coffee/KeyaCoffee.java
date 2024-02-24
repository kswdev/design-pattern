package structural.decorator.coffee;

public class KeyaCoffee extends Coffee {
    @Override
    public void brewing() {
        System.out.printf("케야 커피! ");
    }
}
