package main.enums;

import main.game.Pitching;

public enum PitchingResult {
    //ストライク
    STRIKE(0),
    //ボール
    BALL(1);

    private int id; // フィールドの定義

    private PitchingResult(int id) { // コンストラクタの定義
        this.id = id;
    }
}
