package org.snakeAndLadder.player;

import org.junit.jupiter.api.Test;
import org.snakeAndLadder.artifects.Artifects;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void move() {

        Player player = new Player(new Artifects(),1 );
        player.move(1) ;
        assertEquals(1, player.getPosition()) ;


    }
}