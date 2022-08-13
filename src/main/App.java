package main;

import main.game.Game;
import main.gui.MainFrame;

public class App {
    public static void main(String[] args) throws Exception {

        Game game = new Game();
        //ゲーム板の表示
        MainFrame frame = new MainFrame("MainFrame");
        frame.setVisible(true);
        //初期設定
        game.gameInitilized(frame);
        //ゲームのメイン処理
        game.gameProcess(frame);
        //結果の表示
        game.gameResultMessageDisplay();
    }
}
