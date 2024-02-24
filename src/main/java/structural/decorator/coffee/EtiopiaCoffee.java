package structural.decorator.coffee;

public class EtiopiaCoffee extends Coffee {
    @Override
    public void brewing() {
        System.out.printf("에티오피아 커피! ");
    }
}
