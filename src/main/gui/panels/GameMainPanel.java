package main.gui.panels;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.nio.file.Files;
import java.nio.file.Paths;

import main.gui.labels.CountLabel;
import main.gui.labels.TextLabel;

public class GameMainPanel extends JPanel {

  String imgPath = "./src/main/gui/panels/img/baseballStadium.png";
  Image img = Toolkit.getDefaultToolkit().getImage(imgPath);

  TextLabel inningLabel = new TextLabel("", 50, 50, 30);
  CountLabel countLabel = new CountLabel();
  TextLabel batterResultLabel = new TextLabel("安打", 50, 50, 30);

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
}
