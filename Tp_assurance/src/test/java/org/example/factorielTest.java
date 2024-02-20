package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class factorielTest {
    factoriel fact = new factoriel();
    @Test
    public void testFactorielWithZero() {
        int result = fact.factoriel(0);
        assertEquals(1, result);
    }

    @Test
    public void testFactorielWithOne() {
        int result = fact.factoriel(1);
        assertEquals(1, result);
    }

    @Test
    public void testFactorielWithPositiveNumber() {
        int result = fact.factoriel(3);
        assertEquals(6, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorielWithNegativeNumber() {
        fact.factoriel(-1);
    }

}