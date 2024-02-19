package behavioral.template_method;

import behavioral.template_method.level.BeginnerLevel;
import behavioral.template_method.level.PlayerLevel;

public class Player {
    private PlayerLevel level;

    public Player() {
        this.level = new BeginnerLevel();
        level.showLevelmessage();
    }

    public void upgradeLevel(PlayerLevel level) {
        level.showLevelmessage();
        this.level = level;
    }

    public void play(int count) {
        level.go(count);
    }

    public PlayerLevel getPlayerLevel() {
        return level;
    }
}
