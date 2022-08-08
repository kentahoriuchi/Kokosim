package main.enums;

import main.game.Batting;

public enum BattingResult {
    //スイング
    SWING(0),
    //見る
    WAIT(1);
    private int id; // フィールドの定義

    private BattingResult(int id) { // コンストラクタの定義
        this.id = id;
    }

}
