package org.snakeAndLadder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.snakeAndLadder.artifects.Artifects;
import org.snakeAndLadder.dice.Dice;
import org.snakeAndLadder.player.Player;

public class Main {

    private static List<Player> players = new ArrayList<>();

    public static void creatPlayers(int num){

        Artifects artifects = new Artifects();
        for (int i = 0 ; i < num; i++){

            Player player = new Player(artifects, i+1);
            players.add(player);
        }
    }

    public static void main(String[] args) {

//        dice = new Dice();

        System.out.println("Enter number of players joining the game: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        
        creatPlayers(Integer.parseInt(input));

        while(true){
            int countPlayer = 0;
            for (Player player : players) {
                player.play();
                if (player.getPosition() == 100){
                    System.out.println("!! Player " + player.getPlayernumber() + "won the game .") ;
                    break ;
                }


                
            }

        }


    }


    
}