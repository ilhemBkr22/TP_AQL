package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeapYearAfterTest {



    @Test
        public void leapYearsThatAreNonCenturialYears() {
            LeapYearAfter ly = new LeapYearAfter();
            boolean result = ly.isLeapYear(2016);
            Assertions.assertTrue(result);
        }
    @Test
        public void leapCenturialYears() {
            LeapYearAfter ly = new LeapYearAfter();
            Assertions.assertTrue(ly.isLeapYear(2000));
        }
        @Test
        public void nonLeapCenturialYears() {
            LeapYearAfter ly = new LeapYearAfter();
            Assertions.assertFalse(ly.isLeapYear(1500));
        }

        @Test
        public void nonLeapYears() {
            LeapYearAfter ly = new LeapYearAfter();
            Assertions.assertTrue(ly.isLeapYear(2017));
        }
}