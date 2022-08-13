package main.gui.labels;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import main.enums.CountItem;

public class CountLabel extends JLabel {

  GridBagLayout gbl = new GridBagLayout();
  //カウントインスタンスを入れる配列
  TextLabel[] textLabels = new TextLabel[3];

  public CountLabel() {
    setLayout(gbl);
    setHorizontalAlignment(JLabel.RIGHT);
    setFont(new Font("Serif", Font.PLAIN, 30));

    addText("B", 0, 0);
    addText("S", 0, 1);
    addText("O", 0, 2);
    for (int i = 0; i < 3; i++) {
      TextLabel textLabel = addCount("0", 1, i);
      textLabels[i] = textLabel;
    }
  }

  void addText(String text, int x, int y) {
    TextLabel textLabel = new TextLabel(text, 40,30,30);
    gbl.setConstraints(textLabel, addContent(x, y, 1, 1));
    add(textLabel);
  }

  TextLabel addCount(String text, int x, int y) {
    TextLabel textLabel = new TextLabel(text, 40,30,30);
    gbl.setConstraints(textLabel, addContent(x, y, 1, 1));
    add(textLabel);
    return textLabel;
  }

  public void setCount(int count, CountItem countItem) {
    switch (countItem) {
      case BALL:
        textLabels[0].setText(String.valueOf(count));
        break;
      case STRIKE:
        textLabels[1].setText(String.valueOf(count));
        break;
      case OUT:
        textLabels[2].setText(String.valueOf(count));
        break;
    }
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
