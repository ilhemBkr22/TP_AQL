package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void testFibonacciWithZero() {
        int result = Fibonacci.fibonacci(0);
        assertEquals(0, result);
    }

    @Test
    public void testFibonacciWithOne() {
        int result = Fibonacci.fibonacci(1);
        assertEquals(1, result);
    }

    @Test
    public void testFibonacciWithPositiveNumber() {
        int result = Fibonacci.fibonacci(5);
        assertEquals(5, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFibonacciWithNegativeNumber() {
        Fibonacci.fibonacci(-1);
    }
}
