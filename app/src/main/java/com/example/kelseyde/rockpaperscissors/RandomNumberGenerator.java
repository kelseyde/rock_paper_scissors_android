package com.example.kelseyde.rockpaperscissors;


import java.util.Random;

public class RandomNumberGenerator implements NumberGenerating {

    public int getRandomNumber(int upperLimit) {
        Random random = new Random();
        int randomNumber = random.nextInt(upperLimit);
        return randomNumber;
    }

}
