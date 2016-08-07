package com.example;

import java.util.Random;

public class JokeClass {

    private Random random = new Random();

    public String getJoke(){
        String joke;
        switch (random.nextInt(3)) {
            case 0:
                joke = "This is joke!";
                break;
            case 1:
                joke = "This is another joke!!";
                break;
            default:
                joke = "This is a funny joke!!!";
                break;
        }
        return joke;
    }

}
