package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

    public class StackTest {

        @Test
        public void testPushAndPop() {
            Stack stack = new Stack();
            stack.push(5);
            stack.push(8);
            stack.push(0);
            assertEquals(15, stack.pop());
            assertEquals(8, stack.pop());
            assertEquals(0, stack.pop());
        }

        @Test
        public void testPeek() {
            Stack stack = new Stack();
            stack.push(5);
            stack.push(10);
            assertEquals(10, stack.peek());
            assertEquals(2, stack.size());
        }

        @Test
        public void testIsEmpty() {
            Stack stack = new Stack();
            assertTrue(stack.isEmpty());

            stack.push(8);
            assertFalse(stack.isEmpty());
        }

        @Test
        public void testSize() {
            Stack stack = new Stack();
            assertEquals(0, stack.size());
            stack.push(5);
            stack.push(8);
            stack.pop();
            assertEquals(1, stack.size());
            stack.push(8);
            assertEquals(2, stack.size());
        }
        @Test
        public void testExpandArray() {
            Stack stack = new Stack();
            stack.push(1);
           stack.push(2);
            stack.push(3);
            stack.expandArray();

            assertEquals(20, stack.array.length);



        }
    }


