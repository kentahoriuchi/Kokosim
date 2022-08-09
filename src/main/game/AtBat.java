package main.game;

import main.entity.Batter;
import main.entity.Pitcher;
import main.enums.AtBatResult;
import main.game.part.Batting;
import main.game.part.WhenConnect;
import main.game.part.Pitching;

public class AtBat {
    //プレイヤー情報
    public Pitcher pitcher;
    public Batter batter;

    //カウント系
    public int strikeCount;
    public int ballCount;

    public AtBatResult batterBoxResult;

    public AtBat(Pitcher pitcher, Batter batter) {
        this.pitcher = pitcher;
        this.batter = batter;
    }

    public AtBat() {
    }

    public AtBatResult getAtBatResult() {
        while(true) {
            if (!this.OneBall()) {
                return this.batterBoxResult;
            }
        }
    }

    public boolean OneBall() {
        Pitching pitching = new Pitching();
        Batting batting = new Batting();
        //投球結果処理
        OneBall oneBall =
                new OneBall(batting.getBattingResult(), pitching.getPitchingResult());

        switch (oneBall.getOneBallResult()) {
            case STRIKE:
                this.strikeCount += 1;
                break;
            case BALL:
                this.ballCount += 1;
                break;
            case CONNECT:
                WhenConnect whenConnect = new WhenConnect();
                this.batterBoxResult = whenConnect.getConnectResult();
                return false;
        }

        if (this.strikeCount >= 3) {
            batterBoxResult = AtBatResult.OUT;
            return false;
        }
        if (this.ballCount >= 4) {
            batterBoxResult = AtBatResult.FOURBALL;
            return false;
        }
        return true;
    }
}
