package main.gui;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
  public static void main(String args[]) {
    MainFrame frame = new MainFrame("MainFrame");
    frame.setVisible(true);
  }

  MainFrame (String title) {
    setTitle(title);
    setBounds(100, 100, 600, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
