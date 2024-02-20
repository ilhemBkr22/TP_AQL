package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

        @Test
        public void testGetFullName() {
            Person person = new Person("ilhem","bekri",23);
            assertEquals("ilhem bekri", person.getFullName());
        }

        @Test
        public void testAdult() {
            Person adultPerson = new Person("asmaa", "bekri", 23);
            assertTrue(adultPerson.isAdult());
            Person adultPerson18 = new Person("hadil", "bensaid", 18);
            assertTrue(adultPerson18.isAdult());
        }
    @Test
            public void testnotAdult() {
            Person minorPerson = new Person("wahab", "bekri", 8);
            assertFalse(minorPerson.isAdult());
            Person minorPerson18 = new Person("malik", "bekri", 17);
           assertFalse(minorPerson18.isAdult());
        }
    }

