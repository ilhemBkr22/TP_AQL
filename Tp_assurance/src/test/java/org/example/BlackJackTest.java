package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackJackTest {
    @Test
    public void leftPlayerWins() {
        int result = new BlackJack().play(10, 9);
        Assertions.assertEquals(10, result);
    }
    @Test
    public void RightPlayerWins() {
        int result = new BlackJack().play(22, 13);
        Assertions.assertEquals(0, result);
    }
}