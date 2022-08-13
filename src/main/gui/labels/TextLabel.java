package main.gui.labels;

import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Font;

public class TextLabel extends JLabel {
  public TextLabel(String text, int width, int height, int size) {
    setText(text);
    setPreferredSize(new Dimension(width, height));
    setHorizontalAlignment(JLabel.CENTER);
    setFont(new Font("Serif", Font.PLAIN, size));
  }
}
