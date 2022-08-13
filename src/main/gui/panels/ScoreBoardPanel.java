package main.gui.panels;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import main.gui.labels.ScoreBoardLabel;
import main.gui.labels.ScoreBoardTeamLabel;

public class ScoreBoardPanel extends JPanel {

  GridBagLayout gbl = new GridBagLayout();
  //得点板インスタンスを入れる配列
  ScoreBoardTeamLabel[] scoreBoardTeamLabels = new ScoreBoardTeamLabel[2];
  ScoreBoardLabel[][] scoreBoardLabels = new ScoreBoardLabel[2][10];

  public ScoreBoardPanel() {
    //得点板色
    setBackground(new Color(0,160,64));
    setLayout(gbl);
    setPreferredSize(new Dimension(600, 150));

    //チーム名セット
    addTeamName("", 0, 0); //左上の空白
    ScoreBoardTeamLabel teamName1 = addTeamName("", 0, 1);
    scoreBoardTeamLabels[0] = teamName1;
    ScoreBoardTeamLabel teamName2 = addTeamName("", 0, 2);
    scoreBoardTeamLabels[1] = teamName2;

    //得点板セット
    for (int j = 2; j < 11; j++) {
      addScoreBoard(String.valueOf(j-1), j, 0);
    }
    addScoreBoard("計", 11, 0);
    //得点データ初期化
    for (int i = 1; i < 3; i++) {
      for (int j = 2; j < 11; j++) {
        ScoreBoardLabel scoreBoardLabel = addScoreBoard("", j, i);
        scoreBoardLabels[i-1][j-2] = scoreBoardLabel;
      }
    }
    //合計得点初期化
    ScoreBoardLabel scoreBoardLabelFirst = addScoreBoard("", 11, 1);
    scoreBoardLabels[0][9] = scoreBoardLabelFirst;
    ScoreBoardLabel scoreBoardLabelSecond = addScoreBoard("", 11, 2);
    scoreBoardLabels[1][9] = scoreBoardLabelSecond;
  }

  ScoreBoardLabel addScoreBoard(String text, int x, int y) {
    ScoreBoardLabel scoreBoardLabel = new ScoreBoardLabel(text);
    gbl.setConstraints(scoreBoardLabel, addContent(x, y, 1, 1));
    add(scoreBoardLabel);
    return scoreBoardLabel;
  }

  public void setScoreBoard(int x, int y, int score) {
    scoreBoardLabels[y][x].setText(String.valueOf(score));
  }

  ScoreBoardTeamLabel addTeamName(String team, int x, int y) {
    ScoreBoardTeamLabel teamLabel = new ScoreBoardTeamLabel(team);
    gbl.setConstraints(teamLabel, addContent(x, y, 2, 1));
    add(teamLabel);
    return teamLabel;
  }

  public void setTeamName(int i, String team) {
    scoreBoardTeamLabels[i].setText(team);
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
