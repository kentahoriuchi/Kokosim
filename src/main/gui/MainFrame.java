package main.gui;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Container;

import main.gui.panels.GameMainPanel;
import main.gui.panels.ScoreBoardPanel;

public class MainFrame extends JFrame {
  public static void main(String args[]) {
    MainFrame frame = new MainFrame("MainFrame");
    frame.setVisible(true);
  }

  MainFrame (String title) {
    setTitle(title);
    setBounds(100, 100, 600, 650);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //パネルの追加
    ScoreBoardPanel scoreBoardPanel = new ScoreBoardPanel();
    GameMainPanel gameMainPanel = new GameMainPanel();
    Container container = getContentPane();
    container.add(scoreBoardPanel, BorderLayout.NORTH);
    container.add(gameMainPanel, BorderLayout.SOUTH);
  }
}
