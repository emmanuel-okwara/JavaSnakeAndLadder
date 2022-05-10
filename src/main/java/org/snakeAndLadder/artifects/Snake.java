package org.snakeAndLadder.artifects;

import org.snakeAndLadder.player.Player;

public class Snake extends Movement {



    public Snake() {
        super("snake" , new Board());
    }

    @Override
    public void move(Player player) {

        if (player.getPosition() == getTop()) {
            System.out.println("!You are at the top of the snake 🐍");
            player.setPosition(getBottom());
        }

    }
}
