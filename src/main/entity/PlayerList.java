package main.entity;

import java.util.ArrayList;
import java.util.List;

public class PlayerList {

    private List<Player> playerList;

    public List<Player> getPlayerList() {
        return playerList;
    }

    public PlayerList() {
        this.playerList = new ArrayList<Player>();
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public void addPlayer(Player player) { playerList.add(player); }

}
