package org.snakeAndLadder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Object> players = new ArrayList<>(); 
    private static Dice dice;
 
    public static void creatPlayers(int num){
        for (int i = 0 ; i < num; i++){
            Object player = new Object();
            players.add(player);
        }
    }

    public static void main(String[] args) {

        dice = new Dice();

        System.out.println("Enter number of players joining the game: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        
        creatPlayers(Integer.parseInt(input));

        while(true){
            int countPlayer = 0;
            for (Object player : players) {
                countPlayer += 1;
                System.out.println("Player "+countPlayer+": Enter " + "R or r" + " to role dice" );
                input = scan.nextLine().toLowerCase();

                if (input.contains("r")){
                    int roll = dice.roll();
                    System.out.println("Dice outcome is " + roll);

                    while (roll == 6){
                        System.out.println("Player "+countPlayer+": Enter " + "R or r" + " to role dice and play again" );
                        input = scan.nextLine().toLowerCase();
                    }
                }


                
            }

        }


    }

    
}