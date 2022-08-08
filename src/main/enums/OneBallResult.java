package main.enums;

public enum OneBallResult {
    //ストライク
    STRIKE(0),
    //ボール
    BALL(1),
    //バットに当たる
    CONNECT(2);

    private int id; // フィールドの定義

    private OneBallResult(int id) { // コンストラクタの定義
        this.id = id;
    }
}
