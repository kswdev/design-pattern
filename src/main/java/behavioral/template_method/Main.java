package behavioral.template_method;

import behavioral.template_method.level.AdvancedLevel;
import behavioral.template_method.level.PlayerLevel;
import behavioral.template_method.level.SuperLevel;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);

        PlayerLevel level = new AdvancedLevel();
        player.upgradeLevel(level);
        player.play(2);

        level = new SuperLevel();
        player.upgradeLevel(level);
        player.play(5);
    }
}
