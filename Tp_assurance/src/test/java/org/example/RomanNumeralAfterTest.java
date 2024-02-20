package org.example;

import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.Assertions;

class RomanNumeralAfterTest {

    @Test
    public void singleNumber() {
        RomanNumeralAfter roman = new RomanNumeralAfter();
        int result = roman.convert("I");

        Assertions.assertEquals(1, result);
    }
    @Test
    public void numberWithManyDigits() {
        RomanNumeralAfter roman = new RomanNumeralAfter();
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }
}