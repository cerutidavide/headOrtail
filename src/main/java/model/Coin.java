package model;

import java.util.Random;

public class Coin {
    private String status;
    private static final String HEAD_VALUE="head";
    private static final String TAIL_VALUE="tail";

    public void flip(){
        Random random=new Random();
        if(random.nextBoolean()){
            status=HEAD_VALUE;
        } else{
            status=TAIL_VALUE;
        }

    }

    //EFFECTS: returns the coin's status
    public String checkStatus(){
        return status;
    }
}
