package org.example;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PrimeTest {
      Prime Prime = new Prime();

    @Test
    public void testIsPrimeWithOne() {
        Assertions.assertFalse(Prime.isPrime(1));
    }


    @Test
    public void testIsPrimeWithSupTwoPrimeNumber() {
        Assertions.assertTrue(Prime.isPrime(2));
        Assertions.assertTrue(Prime.isPrime(3));
        Assertions.assertTrue(Prime.isPrime(11));
    }

    @Test
    public void testIsPrimeWithSupTwoNonPrimeNumber() {
        Assertions.assertFalse(Prime.isPrime(4));
        Assertions.assertFalse(Prime.isPrime(9));
        Assertions.assertFalse(Prime.isPrime(10));
    }
}
