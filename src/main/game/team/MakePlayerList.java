package main.game.team;

import main.entity.Player;
import main.entity.PlayerList;

public class MakePlayerList {
    PlayerList playerList = new PlayerList();

    public PlayerList getDummyPlayerList() {
        //ダミーのプレイヤー登録(開発用)
        for (int i = 0; i < 9; i++) {
            Player player = new Player();
            player.setPlayerName("プレイヤー" + String.valueOf(i+1));
            playerList.addPlayer(player);
        }
        return this.playerList;
    }
}
