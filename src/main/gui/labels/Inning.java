package main.gui.labels;

import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Font;

public class Inning extends JLabel {

  public Inning(String text) {
    setText(text);
    setPreferredSize(new Dimension(550, 50));
    setHorizontalAlignment(JLabel.LEFT);
    setFont(new Font("Serif", Font.PLAIN, 30));
  }
}
