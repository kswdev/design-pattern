package structural.adapter;

public class AdapterTest {

    public static void main(String[] args) {

        Print print = new PrintBanner("hello");

        print.printWeak();
        print.printStrong();
    }
}
