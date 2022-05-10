package org.snakeAndLadder.artifects;

import org.junit.jupiter.api.Test;
import org.snakeAndLadder.player.Player;

import static org.junit.jupiter.api.Assertions.*;

class MovementTest {

    @Test
    void artifectsSnake() {
        Movement Snake = new Snake();
        assertEquals("snake" , Snake.getName());
    }


    @Test
    void artifectsLadder() {
        Movement Ladder = new Ladder();
        assertEquals("ladder" , Ladder.getName());
    }

    @Test
    void moveSnake() {
        Snake snake = new Snake();
        int top = snake.getTop() ;
        int bottom = snake.getBottom() ;
        Artifects artifects = new Artifects();
        artifects.addSnake(snake);
        Player player = new Player(artifects, 1);
        player.move(top);
        assertEquals(player.getPosition() , bottom) ;

    }
    @Test
    void moveLadder() {
        Ladder ladder = new Ladder();
        int top = ladder.getTop() ;
        int bottom = ladder.getBottom() ;
        Artifects artifects = new Artifects();
        artifects.addLadder(ladder);
        Player player = new Player(artifects, 1);
        player.move(bottom);
        assertEquals(player.getPosition() , top) ;

    }
}