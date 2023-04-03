package io.turntabl.gameTable;

import io.turntabl.player.Player;

import java.util.LinkedList;

public class GameTable {
    private final LinkedList<Player> players;

    public GameTable() {
        players = new LinkedList<>();
    }

    public LinkedList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    // remove a player from the game
    public void goBust(Player player) {
        players.remove(player);
        System.out.println("Player " + player.getId() + " has gone bust");
        System.out.println();
    }
}
