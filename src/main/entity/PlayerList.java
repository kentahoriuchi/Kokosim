package main.entity;

import java.util.List;

public class PlayerList {

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    private List<Player> playerList;

}
