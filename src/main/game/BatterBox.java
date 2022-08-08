package main.game;

import main.entity.Batter;
import main.entity.Pitcher;
import main.enums.BatResult;

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
        JudgeOneBallResult judgeOneBallResult =
                new JudgeOneBallResult(batting.getBattingResult(), pitching.getPitchingResult());

        switch (judgeOneBallResult.getOneBallResult()) {
            case STRIKE:
                this.strikeCount += 1;
                break;
            case BALL:
                this.ballCount += 1;
                break;
            case CONNECT:
                ConnectResult connectResult = new ConnectResult();
                this.batterBoxResult = connectResult.getConnectResult();
                return false;
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
