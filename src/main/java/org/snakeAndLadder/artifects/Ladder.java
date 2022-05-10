package org.snakeAndLadder.artifects;

import org.snakeAndLadder.player.Player;

public class Ladder extends Movement {


    public Ladder() {
        super("ladder", new Board());
    }

    @Override
    public void move(Player player) {

        if (player.getPosition() == getBottom()){
            System.out.println("!You are at the bottom of a ladder 🪜");
            player.setPosition(getTop());
        }

    }
}
