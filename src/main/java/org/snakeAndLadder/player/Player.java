package org.snakeAndLadder.player;

import org.snakeAndLadder.artifects.Artifects;
import org.snakeAndLadder.artifects.Ladder;
import org.snakeAndLadder.artifects.Snake;
import org.snakeAndLadder.dice.Dice;

import java.util.Scanner;

public class Player {



    private Dice dice ;
    private int turns;

    private int position;

    private String playerInput ;

    private Artifects artifects ;

    private int playernumber ;

    public Player(Artifects artifects , int playernumber){

        this.position = 0;
        this.turns = 1;
        this.artifects = artifects ;
        this.dice = new Dice();
        this.playerInput = "" ;
        this.playernumber = playernumber ;

    }

    public void move(int steps){
        boolean validMove= this.position + steps <= 100;
        if (validMove){
            this.position += steps;

            for (Snake snake : getArtifects().getSnake()) snake.move(this);
            for (Ladder ladder : getArtifects().getLadder()) ladder.move(this) ;

        }
        
    }

    public Artifects getArtifects(){
        return this.artifects;
    }

    public int getPosition(){
        return this.position;
    }
    public void setPosition(int position){
        this.position = position;
    }

    public int getPlayernumber(){
        return this.playernumber;
    }

    public void play(){
        readInput();
        int diceNumber = this.dice.roll() ;
        System.out.println("you rolled a "+diceNumber);
        move(diceNumber);
        System.out.println("Player "+ this.playernumber +" is at block " + getPosition());

        if (diceNumber == 6) play();

    }

    public void readInput(){
        Scanner scan = new Scanner(System.in) ;
        System.out.println("Enter r or roll to roll the dice." + " (player " + playernumber +").");
        this.playerInput = scan.nextLine();
        while((!this.playerInput.equalsIgnoreCase("r"))){
            System.out.println("Enter r or roll to roll the dice.");
            this.playerInput = scan.nextLine() ;
        }
    }
}
