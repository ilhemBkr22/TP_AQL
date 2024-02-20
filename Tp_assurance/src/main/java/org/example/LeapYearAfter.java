package org.example;


public class LeapYearAfter {

    public boolean isLeapYear(int year) {
        if (year % 4 == 0)
            return true;
        if ( year % 400 == 0)
            return true;
        return year % 100 == 0;
    }
}