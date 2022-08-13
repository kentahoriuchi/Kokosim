package main.gui.labels;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class CountLabel extends JLabel {

  GridBagLayout gbl = new GridBagLayout();

  public CountLabel() {
    setLayout(gbl);
    setHorizontalAlignment(JLabel.RIGHT);
    setFont(new Font("Serif", Font.PLAIN, 30));

    addText("B", 0, 0);
    addText("S", 0, 1);
    addText("O", 0, 2);
    addText("0", 1, 0);
    addText("0", 1, 1);
    addText("0", 1, 2);
  }

  void addText(String text, int x, int y) {
    TextLabel textLabel = new TextLabel(text, 40,30,30);
    gbl.setConstraints(textLabel, addContent(x, y, 1, 1));
    add(textLabel);
  }

  GridBagConstraints addContent(int x, int y, int w, int h) {
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.fill = GridBagConstraints.BOTH;
    gbc.gridx = x;
    gbc.gridy = y;
    gbc.gridwidth = w;
    gbc.gridheight = h;
    return gbc;
  }
}
