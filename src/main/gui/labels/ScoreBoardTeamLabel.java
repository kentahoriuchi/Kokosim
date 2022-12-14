package main.gui.labels;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class ScoreBoardTeamLabel extends JLabel {

  public ScoreBoardTeamLabel(String text) {
    setText(text);
    setPreferredSize(new Dimension(100, 45));
    setHorizontalAlignment(JLabel.CENTER);
    setBorder(new LineBorder(Color.WHITE,2));
    setFont(new Font("Serif", Font.PLAIN, 30));
  }
}
