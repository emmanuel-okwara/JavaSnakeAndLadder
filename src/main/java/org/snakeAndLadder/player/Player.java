package org.snakeAndLadder.player;

public class Player {
    private int position;
    private int turns;

    public void Player(){
        this.position = 0;
        this.turns = 1;
    }

    public void move(int steps){
        boolean validMove= this.position + steps <= 100;
        if (validMove){
            this.position += steps;
        }
        
    }
    
}
