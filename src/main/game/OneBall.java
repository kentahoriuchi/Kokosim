package main.game;

import main.enums.BattingResult;
import main.enums.OneBallResult;
import main.enums.PitchingResult;

public class OneBall {

    private BattingResult battingResult;
    private PitchingResult pitchingResult;

    public OneBall(BattingResult battingResult, PitchingResult pitchingResult) {
        this.battingResult = battingResult;
        this.pitchingResult = pitchingResult;
    }

    public OneBallResult getOneBallResult() {
        switch (this.battingResult) {
            case WAIT:
                switch (this.pitchingResult) {
                    case BALL:
                        return OneBallResult.BALL;
                    case STRIKE:
                        return OneBallResult.STRIKE;
                }
            case SWING:
                switch (this.pitchingResult) {
                    case BALL:
                        return OneBallResult.STRIKE;
                    case STRIKE:
                        return OneBallResult.CONNECT;
                }
        }
        return OneBallResult.STRIKE;
    }
}
