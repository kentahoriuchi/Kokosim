package main.gui;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Container;

import main.enums.AtBatResult;
import main.enums.CountItem;
import main.gui.panels.GameMainPanel;
import main.gui.panels.ScoreBoardPanel;

public class MainFrame extends JFrame {

  ScoreBoardPanel scoreBoardPanel = new ScoreBoardPanel();
  GameMainPanel gameMainPanel = new GameMainPanel();

  public MainFrame (String title) {
    setTitle(title);
    setBounds(100, 100, 600, 650);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //パネルの追加
    Container container = getContentPane();
    container.add(scoreBoardPanel, BorderLayout.NORTH);
    container.add(gameMainPanel, BorderLayout.SOUTH);
  }

  //得点更新
  public void setScoreBoard(int x, int y, int score) {
    scoreBoardPanel.setScoreBoard(x, y, score);
  }
  //チーム名セット
  public void setTeamName(int i, String team) {
    scoreBoardPanel.setTeamName(i, team);
  }
  //イニング表示
  public void setInning(int inning, String topOrBottom) { gameMainPanel.setInning(inning, topOrBottom); }
  //カウント更新
  public void setCount(int count, CountItem countItem) { gameMainPanel.setCount(count, countItem); }
  //打席結果表示
  public void setBatterResultLabel(AtBatResult atBatResult) { gameMainPanel.setBatterResultLabel(atBatResult); }
  //打者カウント初期化
  public void initializedBatterCount() {
    gameMainPanel.setCount(0, CountItem.BALL);
    gameMainPanel.setCount(0, CountItem.STRIKE);
  }
  //アウトカウント初期化
  public void initializedOutCount() {
    gameMainPanel.setCount(0, CountItem.OUT);
  }
  //打席結果初期化
  public void initializedBatterResultLabel() {
    gameMainPanel.setBatterResultLabel(AtBatResult.NONE);
  }
  //ランナー表示
  public void setRunner(boolean[] runner) { gameMainPanel.setRunner(runner); }
  //ランナー初期化
  public void initializedRunner() { gameMainPanel.setRunner(new boolean[] {false,false,false}); }
}
