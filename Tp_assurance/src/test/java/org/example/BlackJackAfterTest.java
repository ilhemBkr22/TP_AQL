package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackJackAfterTest {


    @Test
    public void leftPlayerWins() {
        int result = new BlackJackAfter().play(10, 9);
        Assertions.assertEquals(10, result);
    }
    @Test
    public void RightPlayerWins() {
        int result = new BlackJackAfter().play(22, 13);
        Assertions.assertEquals(13, result);
    }
}