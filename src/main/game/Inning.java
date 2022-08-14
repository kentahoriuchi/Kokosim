package main.game;

import main.enums.CountItem;
import main.gui.MainFrame;

public class Inning {
    //アウトカウント
    private int outCount;
    //ランナー
    private boolean[] runner;

    //得点
    private int score;

    public void initialized () {
        this.outCount = 0;
        this.score = 0;
        this.runner = new boolean[] {false,false,false};
    }

    public void hitProcess () {
        boolean[] newRunner = new boolean[] {true,false,false};
        if (this.runner[0] == true) {
            newRunner[1] = true;
        }
        if (this.runner[1] == true) {
            newRunner[2] = true;
        }
        if (this.runner[2] == true) {
            this.score += 1;
        }
        this.runner = newRunner;
    }

    public void homerunProcess () {
        int homerunScore = 1;
        for (int i = 0 ; i < this.runner.length ; i++) {
            if (runner[i]) {
                homerunScore += 1;
            }
        }
        this.score += homerunScore;
        //ランナー更新
        this.runner = new boolean[] {false,false,false};
    }

    public void fourballProcess () {
        boolean[] newRunner = new boolean[] {true,false,false};
        if (this.runner[0] == true) {
            newRunner[1] = true;
        }
        if (this.runner[1] == true) {
            newRunner[1] = true;
        }
        if (this.runner[2] == true) {
            newRunner[2] = true;
        }
        if (this.runner[0] == true && this.runner[1] == true) {
            newRunner[2] = true;
        }
        if (this.runner[0] == true && this.runner[1] == true && this.runner[2] == true) {
            this.score += 1;
        }
        this.runner = newRunner;
    }

    public void addOutCount (){
        this.outCount += 1;
    }

    public int getScore() {
        return score;
    }

    public int getOutCount() {
        return outCount;
    }

    public String getRunner() {
        String n = "";
        if (runner[0]) {
            n += "1";
        }
        if (runner[1]) {
            n += "2";
        }
        if (runner[2]) {
            n += "3";
        }

        return n;
    }

    public boolean changeJudge(MainFrame frame) {
        if (this.outCount >= 3) {
            return true;
        }
        else {
            frame.setCount(outCount, CountItem.OUT); //アウトカウント更新
            frame.setRunner(runner); //ランナー更新
            return false;
        }
    }
}
