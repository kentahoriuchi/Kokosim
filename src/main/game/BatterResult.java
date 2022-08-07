package main.game;

import main.enums.BatResult;

public class BatterResult {

    public BatResult getResult() {
        BatterBox batterBox = new BatterBox();
        while(true) {
            if (!batterBox.OneBall()) {
                return batterBox.getBatterBoxResult();
            }
        }
    }
}
