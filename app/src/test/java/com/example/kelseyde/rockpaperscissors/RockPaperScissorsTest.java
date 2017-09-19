package com.example.kelseyde.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RockPaperScissorsTest {

    RockPaperScissors rockPaperScissors;
    @Before
    public void before() {
        rockPaperScissors = new RockPaperScissors();

    }

    @Test
    public void testPlayerWins() {
        rockPaperScissors.setRobotHand(HandType.ROCK);
        rockPaperScissors.setPlayerHand(HandType.PAPER);
        assertEquals("Robot chose ROCK. YOU WIN!", rockPaperScissors.compareHands());
    }

    @Test
    public void testRobotWins() {
        rockPaperScissors.setRobotHand(HandType.PAPER);
        rockPaperScissors.setPlayerHand(HandType.ROCK);
        assertEquals("Robot chose PAPER. YOU LOSE!", rockPaperScissors.compareHands());
    }

    @Test
    public void testDraw() {
        rockPaperScissors.setPlayerHand(HandType.ROCK);
        rockPaperScissors.setRobotHand(HandType.ROCK);
        assertEquals("Robot chose ROCK. DRAW!", rockPaperScissors.compareHands());
    }

}