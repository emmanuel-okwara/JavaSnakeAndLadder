package org.snakeAndLadder;

import org.junit.jupiter.api.Test;
import org.snakeAndLadder.dice.Dice;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

public class Tests {

    @Test
    void TesRoll(){
        Dice dice = new Dice();
        int roll = dice.roll();
        Boolean isInRange = 1 <= roll && roll <= 6;
        assertTrue(isInRange);
    }
    
}
