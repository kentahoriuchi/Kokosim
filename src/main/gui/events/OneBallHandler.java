package main.gui.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.game.AtBat;

public class OneBallHandler implements ActionListener {

  public OneBallHandler() {
  }

  public void actionPerformed(ActionEvent e) {
    System.out.println("ボタンが押されました");
  }
}
