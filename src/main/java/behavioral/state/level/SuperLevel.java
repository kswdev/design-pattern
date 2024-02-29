package behavioral.state.level;

public class SuperLevel extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("빨리 달리기");
    }

    @Override
    public void jump() {
        System.out.println("빨리 점프");
    }

    @Override
    public void turn() {
        System.out.println("빨리 돌기");
    }

    @Override
    public void showLevelmessage() {
        System.out.println("********* 고수 **********");
    }
}
