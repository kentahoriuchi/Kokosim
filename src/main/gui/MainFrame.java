package main.gui;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Container;

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
}
