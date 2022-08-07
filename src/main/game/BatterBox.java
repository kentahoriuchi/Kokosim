package main.game;

import main.entity.Batter;
import main.entity.Pitcher;
import main.enums.BatResult;

import java.util.Random;

public class BatterBox {

    public Pitcher pitcher;
    public Batter batter;

    //カウント系
    public int strikeCount;
    public int ballCount;

    public BatResult batterBoxResult;

    public BatterBox(Pitcher pitcher, Batter batter) {
        this.pitcher = pitcher;
        this.batter = batter;
    }

    public BatterBox() {
    }

    public boolean OneBall() {
        Pitching pitching = new Pitching();
        Batting batting = new Batting();
        //投球結果処理
        Random rand = new Random();
        int num = rand.nextInt(100);

        if (num > 70) {
            Random rand2 = new Random();
            int num2 = rand.nextInt(100);
            if (num2 > 50) {
                batterBoxResult = BatResult.OUT;
            }
            else if (num2 > 5) {
                batterBoxResult = BatResult.HIT;
            }
            else {
                batterBoxResult = BatResult.HOMERUN;
            }
            return false;
        }
        else if (num > 30) {
            this.strikeCount += 1;
        }
        else {
            this.ballCount += 1;
        }
        if (this.strikeCount >= 3) {
            batterBoxResult = BatResult.OUT;
            return false;
        }
        if (this.ballCount >= 4) {
            batterBoxResult = BatResult.FOURBALL;
            return false;
        }
        return true;
    }

    public BatResult getBatterBoxResult() {
        return batterBoxResult;
    }
}
