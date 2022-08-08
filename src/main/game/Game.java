package main.game;

import main.entity.Scores;
import main.entity.Team;
import main.enums.BatResult;
import main.enums.GameResult;

public class Game {

    public Team team1 = new Team();
    public Team team2 = new Team();

    Scores firstTeamScore = new Scores();
    Scores secondTeamScore = new Scores();

    Inning inning = new Inning();

    public void gameInitilized () {
        firstTeamScore.initializedScore();
        secondTeamScore.initializedScore();
    }

    public void gameProcess () {
        //1回から9回まで得点を記録する
        for (int i = 0 ; i < 9 ; i++) {
            System.out.println(Integer.toString(i+1) + "回表");
            GameInningProcess(firstTeamScore);
            System.out.println(Integer.toString(i+1) + "回裏");
            GameInningProcess(secondTeamScore);
        }
    }

    //イニング処理
    public void GameInningProcess(Scores scores) {
        inning.initialized();
        //アウトカウントが3未満なら続行
        while (true) {
            main.game.BatterResult batterResult = new main.game.BatterResult();
            //打席結果
            BatResult batResult = batterResult.getResult();
            switch (batResult) {
                case HIT:
                    inning.hitProcess();
                    break;
                case HOMERUN:
                    inning.homerunProcess();
                    break;
                case FOURBALL:
                    inning.fourballProcess();
                    break;
                case OUT:
                    inning.addOutCount();
                    break;
            }
            System.out.println("Result : " + batResult);
            System.out.println("Runner : " + inning.getRunner());
            System.out.println("Out : " + inning.getOutCount());
            if (inning.changeJudge()) {
                scores.addScore(inning.getScore());
                System.out.println("Score : " + inning.getScore());
                break;
            }
        }
    }

    public GameResult gameResult() {
        int sumFirstScore = firstTeamScore.sumScore();
        int sumSecondScore = secondTeamScore.sumScore();

        if (sumFirstScore > sumSecondScore) {
            return GameResult.FIRSTWIN;
        }
        else if (sumSecondScore > sumFirstScore){
            return GameResult.SECONDWIN;
        }
        else {
            return GameResult.DRAW;
        }
    }

    public void gameResultMessageDisplay() {
        System.out.print("First Team ");
        System.out.print(" || ");
        for (int s : firstTeamScore.getScore()) {
            System.out.print(s);
            System.out.print(" | ");
        }
        System.out.print("| ");
        System.out.print(firstTeamScore.sumScore());
        System.out.print("\n");
        System.out.println("---------------------------------------------------");
        System.out.print("Second Team");
        System.out.print(" || ");
        for (int s : secondTeamScore.getScore()) {
            System.out.print(s);
            System.out.print(" | ");
        }
        System.out.print("| ");
        System.out.print(secondTeamScore.sumScore());
        System.out.print("\n");

        switch (this.gameResult()) {
            case FIRSTWIN:
                System.out.println("First Team Win!");
                break;
            case SECONDWIN:
                System.out.println("Second Team Win!");
                break;
            default:
                System.out.println("Draw Game");
        }
    }
}
