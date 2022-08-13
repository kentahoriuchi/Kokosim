package main.gui.panels;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import main.gui.labels.Score;
import main.gui.labels.ScoreBoardTeam;

public class ScoreBoardPanel extends JPanel {

  GridBagLayout gbl = new GridBagLayout();

  public ScoreBoardPanel() {
    setBackground(new Color(0,160,64));
    setLayout(gbl);
    setPreferredSize(new Dimension(600, 150));

    addTeamName("", 0, 0);
    addTeamName("Team1", 0, 1);
    addTeamName("Team2", 0, 2);

    for (int j = 2; j < 11; j++) {
      addScoreBoard(String.valueOf(j-1), j, 0);
    }
    for (int i = 1; i < 3; i++) {
      for (int j = 2; j < 11; j++) {
        addScoreBoard("１", j, i);
      }
    }
  }

  void addScoreBoard(String text, int x, int y) {
    Score score = new Score(text);
    gbl.setConstraints(score, addContent(x, y, 1, 1));
    add(score);
  }

  void addTeamName(String team, int x, int y) {
    ScoreBoardTeam score = new ScoreBoardTeam(team);
    gbl.setConstraints(score, addContent(x, y, 2, 1));
    add(score);
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
