package org.snakeAndLadder.artifects;

import java.util.*;

public class Board {



    private List<List<Integer>> board ;

    public Board() {
        this.board = new ArrayList<List<Integer>>();
        createBoard();

    }

    private void createBoard() {

        for (int i : Range(1, 100 , 10)){
            List<Integer> row = new ArrayList<Integer>();
            for (int num : Range(i, i+10 , 1)){
                row.add(num);
            }
            this.board.add(row);
        }
    }

    private List<Integer> Range(int inclusive, int exclusive , int jump) {

        List<Integer> board = new ArrayList<Integer>();
        for (int i = inclusive; i < exclusive;){
            board.add(i) ;
            i += jump ;
        }

        return board ;
    }

    public List<List<Integer>> getBoard(){

        return this.board ;

    }

}
