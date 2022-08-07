package main;

import main.game.Game;

public class App {
    public static void main(String[] args) throws Exception {

        Game game = new Game();
        //初期設定
        game.gameInitilized();
        //ゲームのメイン処理
        game.gameProcess();
        //結果の表示
        game.gameResultMessageDisplay();
    }
}
