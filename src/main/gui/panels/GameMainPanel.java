package main.gui.panels;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.nio.file.Files;
import java.nio.file.Paths;

import main.enums.AtBatResult;
import main.enums.CountItem;
import main.gui.labels.CountLabel;
import main.gui.labels.RunnerLabel;
import main.gui.labels.TextLabel;

public class GameMainPanel extends JPanel {

  String imgPath = "./src/main/gui/panels/img/baseballStadium.png";
  Image img = Toolkit.getDefaultToolkit().getImage(imgPath);

  TextLabel inningLabel = new TextLabel("", 50, 50, 30);
  CountLabel countLabel = new CountLabel();
  TextLabel batterResultLabel = new TextLabel("", 50, 50, 30);

  RunnerLabel[] runnerLabels = new RunnerLabel[3];

  public GameMainPanel() {
    setBackground(Color.RED);
    setLayout(null);
    setPreferredSize(new Dimension(600, 450));
    inningLabel.setBounds(30, 0, 100, 50);
    add(inningLabel);
    countLabel.setBounds(470, 0, 130, 130);
    add(countLabel);
    batterResultLabel.setBounds(30, 350, 100, 50);
    add(batterResultLabel);
    this.initialRunnerLabel();
  }

  public void paintComponent(Graphics g) {
    assert Files.exists(Paths.get(imgPath)) : "Stadium image file not exist";
    super.paintComponent(g);
    //画像の表示
    g.drawImage(img, 0, 0, 600, 450, this);
  }

  public void setInning(int inning, String topOrBottom) {
    inningLabel.setText(String.valueOf(inning) + "回" + topOrBottom);
  }

  public void setCount(int count, CountItem countItem) {
    countLabel.setCount(count, countItem);
  }

  public void setBatterResultLabel(AtBatResult atBatResult) {
    switch (atBatResult) {
      case OUT:
        batterResultLabel.setText("アウト");
        break;
      case HIT:
        batterResultLabel.setText("安打");
        break;
      case HOMERUN:
        batterResultLabel.setText("本塁打");
        break;
      case FOURBALL:
        batterResultLabel.setText("四球");
        break;
      case NONE:
        batterResultLabel.setText("");
        break;
    }
  }

  public void initialRunnerLabel() {
    for (int i = 0; i < 3; i++) {
      runnerLabels[i] = new RunnerLabel();
    }
    runnerLabels[0].setBounds(365, 230, 34, 50);
    add(runnerLabels[0]);
    runnerLabels[1].setBounds(280, 165, 34, 50);
    add(runnerLabels[1]);
    runnerLabels[2].setBounds(200, 230, 34, 50);
    add(runnerLabels[2]);
  }

  public void setRunner(boolean[] runner) {
    for (int i = 0; i < 3; i++) {
      if (runner[i]) { runnerLabels[i].setRunner(); }
      else { runnerLabels[i].deleteRunner(); }
    }
  }
}
