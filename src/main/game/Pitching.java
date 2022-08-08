package main.game;

import main.entity.Pitcher;
import main.enums.PitchingResult;

import java.util.Random;

public class Pitching {
    public Pitcher pitcher;

    public Pitching(Pitcher pitcher) {
        this.pitcher = pitcher;
    }

    public Pitching() {}

    public PitchingResult getPitchingResult() {
        Random rand = new Random();
        int num = rand.nextInt(100);

        if (num > 50) {
            return PitchingResult.STRIKE;
        }
        else {
            return PitchingResult.BALL;
        }
    }
}
