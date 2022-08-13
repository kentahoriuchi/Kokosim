package main.gui.panels;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.nio.file.Files;
import java.nio.file.Paths;

import main.gui.labels.InningLabel;

public class GameMainPanel extends JPanel {

  String imgPath = "./src/main/gui/panels/img/baseballStadium.png";
  Image img = Toolkit.getDefaultToolkit().getImage(imgPath);

  InningLabel inningLabel = new InningLabel("１回表");

  public GameMainPanel() {
    setBackground(Color.RED);
    setPreferredSize(new Dimension(600, 450));
    add(inningLabel);
  }

  public void paintComponent(Graphics g) {
    assert Files.exists(Paths.get(imgPath)) : "Stadium image file not exist";
    super.paintComponent(g);
    //画像の表示
    g.drawImage(img, 0, 0, 600, 450, this);
  }

}
