package com.example.kelseyde.rockpaperscissors;

import java.util.ArrayList;

public class RockPaperScissors {

    private ArrayList<HandType> hands;
    private HandType playerHand;
    private HandType robotHand;
    private NumberGenerating randomNumberGenerator;

    public RockPaperScissors() {
        this.hands = new ArrayList<HandType>();
        this.hands.add(HandType.ROCK);
        this.hands.add(HandType.PAPER);
        this.hands.add(HandType.SCISSORS);
        this.playerHand = null;
        this.robotHand = null;
        this.randomNumberGenerator = new RandomNumberGenerator();
    }

    //getters and setters

    public ArrayList<HandType> getHands() {
        return hands;
    }

    public void setHands(ArrayList<HandType> hands) {
        this.hands = hands;
    }

    public HandType getPlayerHand() {
        return playerHand;
    }

    public void setPlayerHand(HandType playerHand) {
        this.playerHand = playerHand;
    }

    public HandType getRobotHand() {
        return robotHand;
    }

    public void setRobotHand(HandType robotHand) {
        this.robotHand = robotHand;
    }

    public NumberGenerating getRandomNumberGenerator() {
        return randomNumberGenerator;
    }

    public void setRandomNumberGenerator(NumberGenerating randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }

    //methods

    public void setRobotHand() {
        int randomNumber = getRandomNumberGenerator().getRandomNumber(getHands().size() - 1);
        HandType robotHand = getHands().get(randomNumber);
        this.robotHand = robotHand;
    }

    public String compareHands() {
        setRobotHand();
        if ((getPlayerHand().equals(HandType.ROCK) && getRobotHand().equals(HandType.PAPER))
                || (getPlayerHand().equals(HandType.PAPER) && getRobotHand().equals(HandType.SCISSORS))
                || (getPlayerHand().equals(HandType.SCISSORS) && getRobotHand().equals(HandType.ROCK))) {
            return "Robot chose " + getRobotHand().toString() + ". YOU LOSE!";
        } else if ((getPlayerHand().equals(HandType.ROCK) && getRobotHand().equals(HandType.ROCK))
                || (getPlayerHand().equals(HandType.PAPER) && getRobotHand().equals(HandType.PAPER))
                || (getPlayerHand().equals(HandType.SCISSORS) && getRobotHand().equals(HandType.SCISSORS))) {
            return "Robot chose " + getRobotHand().toString() + ". DRAW!";
        } else return "Robot chose " + getRobotHand().toString() + ". YOU WIN!";
    }



}
