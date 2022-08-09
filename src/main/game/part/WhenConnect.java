package main.game.part;

import main.enums.AtBatResult;

import java.util.Random;

public class WhenConnect {

    public AtBatResult getConnectResult () {
        Random rand = new Random();
        int num = rand.nextInt(100);

        if (num > 40) {
            return AtBatResult.OUT;
        }
        else if (num > 5) {
            return AtBatResult.HIT;
        }
        else {
            return AtBatResult.HOMERUN;
        }
    }
}
