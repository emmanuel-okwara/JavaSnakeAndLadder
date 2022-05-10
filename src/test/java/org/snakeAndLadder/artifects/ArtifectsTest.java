package org.snakeAndLadder.artifects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtifectsTest {

    @Test
    void addSnake() {

        Artifects artifects = new Artifects();
        int artifectsSize = artifects.getSnake().size() ;
        artifects.addSnake(new Snake());
        assertEquals(artifectsSize+1, artifects.getSnake().size());

    }

    @Test
    void addLadder() {
        Artifects artifects = new Artifects();
        int artifectsSize = artifects.getLadder().size() ;
        artifects.addLadder(new Ladder());
        assertEquals(artifectsSize+1, artifects.getLadder().size());
    }

}