package behavioral.state;


import behavioral.state.level.AdvancedLevel;
import behavioral.state.level.PlayerLevel;
import behavioral.state.level.SuperLevel;

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
