package org.snakeAndLadder.artifects;

import java.util.Random;

public abstract class ArtifectBase {

    private String artifectName ;

    private Board board ;

    private int top ;

    private int[] topPositions ;

    private int[] bottomPositions ;

    private int bottom ;


    public ArtifectBase(String artifectName , Board board){

        // initialization of artifects name eg (snake or Ladder)

        this.artifectName = artifectName ;
        this.board = board ;
        setBottom();
        setTop();

    }

    private void setBottom(){


        Random random = new Random();
        int numbery =  random.nextInt(9) ;
        int numberx = random.nextInt(9) ;


        if(numberx < 2){
            numberx += 2;
        }else if (numbery < 2){
            numbery += 2 ;
        }
        bottomPositions[0] = numberx ;
        bottomPositions[1] = numbery ;
        bottom = board.getBoard().get(numbery).get(numberx);
    }

    private void setTop(){
        int[] bottomPositions = this.bottomPositions ;
        int topy = bottomPositions[1] + 2 ;
        int topx = new Random().nextBoolean() ? bottomPositions[0] -1 : bottomPositions[0] + 1 ;

        this.topPositions[0] = topx ;
        this.topPositions[1] = topy ;
        top = this.board.getBoard().get(topy).get(topx);
    }

    public String getName(){
        return this.artifectName ;
    }

    public int getTop(){
        return this.top ;
    }
    public int getBottom(){
        return this.bottom ;
    }
}
