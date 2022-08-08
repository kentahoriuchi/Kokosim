package main.enums;

public enum BatResult {
    //アウト
    OUT(0),
    //ヒット
    HIT(1),
    //ホームラン
    HOMERUN(2),
    //フォアボール
    FOURBALL(3);


    private int id; // フィールドの定義

    private BatResult(int id) { // コンストラクタの定義
        this.id = id;
    }
}
