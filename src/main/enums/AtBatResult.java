package main.enums;

public enum AtBatResult {
    //アウト
    OUT(0),
    //ヒット
    HIT(1),
    //ホームラン
    HOMERUN(2),
    //フォアボール
    FOURBALL(3);


    private int id; // フィールドの定義

    private AtBatResult(int id) { // コンストラクタの定義
        this.id = id;
    }
}
