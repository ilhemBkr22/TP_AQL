package org.example;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class calculatorTest1 {
    @Test
    public void addShouldReturnTheSumOfTwoNumbers() {
        // Arrange
        Calculator calculator = new Calculator();
        int a = 2;
        int b = 3;
        // Act
        int result = (int) Calculator.add(a, b);
        // Assert
        assertEquals(5, result);
    }
}