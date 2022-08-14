package main.gui.labels;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RunnerLabel extends JLabel {
  String imgPath = "./src/main/gui/labels/img/sportJogging.png";
  ImageIcon imageIcon = new ImageIcon(imgPath);

  public RunnerLabel() {
    assert Files.exists(Paths.get(imgPath)) : "Runner image file not exist";
    setIcon(null);
  }

  public void setRunner() {
    setIcon(imageIcon);
  }
  public void deleteRunner() {
    setIcon(null);
  }
}
