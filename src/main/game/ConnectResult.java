package main.game;

import main.enums.BatResult;

import java.util.Random;

public class ConnectResult {

    public BatResult getConnectResult () {
        Random rand = new Random();
        int num = rand.nextInt(100);

        if (num > 40) {
            return BatResult.OUT;
        }
        else if (num > 5) {
            return BatResult.HIT;
        }
        else {
            return BatResult.HOMERUN;
        }
    }
}
