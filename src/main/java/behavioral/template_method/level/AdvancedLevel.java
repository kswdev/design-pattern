package behavioral.template_method.level;

public class AdvancedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("달리기");
    }

    @Override
    public void jump() {
        System.out.println("점프");
    }

    @Override
    public void turn() {
        System.out.println("돌기");
    }

    @Override
    public void showLevelmessage() {
        System.out.println("********* 중급 **********");
    }
}
