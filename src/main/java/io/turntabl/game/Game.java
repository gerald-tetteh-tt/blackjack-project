package io.turntabl.game;

import io.turntabl.dealer.Dealer;
import io.turntabl.gameTable.GameTable;
import io.turntabl.player.Player;

public class Game {
    private Dealer dealer;
    private GameTable gameTable;
    private int numberOfPlayers = 3;

    public Game(Dealer dealer, GameTable gameTable) {
        this.dealer = dealer;
        this.gameTable = gameTable;
    }

    public void resetGame() {
        dealer.generateCards();
        generatePlayers();
    }

    private void generatePlayers() {
        for(int i = 1; i <= numberOfPlayers; i++) {
            gameTable.addPlayer(new Player(i));
        }
    }
}
