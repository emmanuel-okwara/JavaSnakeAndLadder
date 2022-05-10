package org.snakeAndLadder.dice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    @Test
    void roll() {
        Dice dice = new Dice();
        int roll = dice.roll();
        Boolean isInRange = 1 <= roll && roll <= 6;
        assertTrue(isInRange);
    }

}