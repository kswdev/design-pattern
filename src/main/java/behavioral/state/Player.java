package behavioral.state;

import behavioral.state.level.BeginnerLevel;
import behavioral.state.level.PlayerLevel;

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
        run();
        for (int i = 0; i < count; i++) {
            jump();
        }
        turn();
    }

    public void run() {
        level.run();
    }

    public void turn() {
        level.turn();
    }

    public void jump() {
        level.jump();
    }

    public PlayerLevel getPlayerLevel() {
        return level;
    }
}
