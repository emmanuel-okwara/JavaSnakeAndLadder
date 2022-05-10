package org.snakeAndLadder.artifects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void getBoardHeight() {
        Board board = new Board();
        assertEquals(10, board.getBoard().size());
    }

    @Test
    void getBoardWidth() {
        Board board = new Board();
        assertEquals(10, board.getBoard().get(0).size());
    }


}