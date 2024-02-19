package behavioral.template_method.level;

public class BeginnerLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("천천히 달리기");
    }

    @Override
    public void jump() {
        System.out.println("천천히 점프");
    }

    @Override
    public void turn() {
        System.out.println("천천히 돌기");
    }

    @Override
    public void showLevelmessage() {
        System.out.println("********* 초보자 **********");
    }
}
