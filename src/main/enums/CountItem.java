package main.enums;

public enum CountItem {
  BALL(0),
  STRIKE(1),
  OUT(2);

  private int id; // フィールドの定義

  private CountItem(int id) { // コンストラクタの定義
    this.id = id;
  }
}
