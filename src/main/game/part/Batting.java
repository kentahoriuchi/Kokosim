package main.game.part;

import main.entity.Batter;
import main.enums.BattingResult;

import java.util.Random;

public class Batting {
    public Batter batter;

    public Batting(Batter batter) {
        this.batter = batter;
    }
    public Batting() {}

    public BattingResult getBattingResult() {
        Random rand = new Random();
        int num = rand.nextInt(100);

        if (num > 50) {
            return BattingResult.SWING;
        }
        else {
            return BattingResult.WAIT;
        }
    }

}
