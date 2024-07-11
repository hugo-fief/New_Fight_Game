package com.mygame;

import com.mygame.battle.Battle;
import com.mygame.player.Player;
import com.mygame.player.PlayerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Game {
    private static final Logger logger = LoggerFactory.getLogger(Game.class);

    public static void main(String[] args) {
        Player player1 = PlayerFactory.createPlayer("warrior", "Player 1");
        Player player2 = PlayerFactory.createPlayer("mage", "Player 2");

        Battle battle = new Battle(player1, player2);
        battle.start();

        logger.info("Game finished");
    }
}
