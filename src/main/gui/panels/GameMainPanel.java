package main.gui.panels;

import javax.swing.JPanel;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.nio.file.Files;
import java.nio.file.Paths;

import main.enums.AtBatResult;
import main.enums.CountItem;
import main.gui.events.OneBallHandler;
import main.gui.labels.CountLabel;
import main.gui.labels.TextLabel;

public class GameMainPanel extends JPanel {

  String imgPath = "./src/main/gui/panels/img/baseballStadium.png";
  Image img = Toolkit.getDefaultToolkit().getImage(imgPath);

  TextLabel inningLabel = new TextLabel("", 50, 50, 30);
  CountLabel countLabel = new CountLabel();
  TextLabel batterResultLabel = new TextLabel("", 50, 50, 30);
  Button button = new Button("一球ごと");
  OneBallHandler oneBallHandler = new OneBallHandler();


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
    button.setBounds(275, 0, 50,50);
    button.addActionListener(oneBallHandler);
    add(button);
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
}
