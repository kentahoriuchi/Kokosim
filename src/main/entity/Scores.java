package main.entity;

import java.util.ArrayList;
import java.util.List;

public class Scores {

    //得点
    private List<Integer> score;
    //ヒット数
    private List<Integer> hitRecord;

    public List<Integer> getScore() {
        return score;
    }

    public void setScore(List<Integer> score) {
        this.score = score;
    }

    public List<Integer> getHitRecord() {
        return hitRecord;
    }

    public void setHitRecord(List<Integer> hitRecord) {
        this.hitRecord = hitRecord;
    }

    public void initializedScore () {
        List<Integer> score = new ArrayList<>();
        this.score = score;
    }

    public void addScore (int s) {
        this.score.add(s);
    }

    public int sumScore () {
        return this.score.stream().mapToInt( i -> i).sum();
    }


}
