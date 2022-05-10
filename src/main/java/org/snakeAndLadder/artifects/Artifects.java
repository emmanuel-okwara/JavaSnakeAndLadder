package org.snakeAndLadder.artifects;
import java.util.*;

public class Artifects {



    List<Snake> snakes ;
    List<Ladder> ladders;

    public Artifects() {
        snakes = new ArrayList<Snake>();
        ladders = new ArrayList<Ladder>();
        generateArtifects();
    }

    public void addSnake(Snake snake){
        this.snakes.add(snake);
    }

    public void addLadder(Ladder ladder){
        this.ladders.add(ladder);
    }

    public List<Snake> getSnake(){
        return this.snakes ;
    }

    public List<Ladder> getLadder(){
        return this.ladders ;
    }



    private void generateArtifects(){
        for (int artifects = 3 ; artifects > 0 ; artifects--){
            addSnake(new Snake());
            addLadder(new Ladder());
        }
    }

}
