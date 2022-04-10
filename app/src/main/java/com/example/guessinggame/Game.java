package com.example.guessinggame;

import java.util.Random;

public class Game {
    private int numToGuess;

    public Game()
    {
        Random random = new Random();
        numToGuess = random.nextInt(11);
    }

    public boolean Check(int i)
    {
        return numToGuess == i;
    }
}
