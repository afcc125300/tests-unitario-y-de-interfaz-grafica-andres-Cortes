package com.example.parcial1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ExampleUnitTest {

    @Test
    public void testFibonacci() {
        assertEquals(0, MainActivity.fibonacci(0));
        assertEquals(1, MainActivity.fibonacci(1));
        assertEquals(1, MainActivity.fibonacci(2));
        assertEquals(2, MainActivity.fibonacci(3));
        assertEquals(3, MainActivity.fibonacci(4));
        assertEquals(5, MainActivity.fibonacci(5));
        assertEquals(8, MainActivity.fibonacci(6));
    }

    @Test
    public void testMultiply() {
        assertEquals(0, MainActivity.multiply(0, 5));
        assertEquals(0, MainActivity.multiply(5, 0));
        assertEquals(5, MainActivity.multiply(1, 5));
        assertEquals(10, MainActivity.multiply(2, 5));
        assertEquals(15, MainActivity.multiply(3, 5));
        assertEquals(20, MainActivity.multiply(4, 5));
        assertEquals(25, MainActivity.multiply(5, 5));
    }

    @Test
    public void testPower() {
        assertEquals(1, MainActivity.power(5, 0));
        assertEquals(5, MainActivity.power(5, 1));
        assertEquals(25, MainActivity.power(5, 2));
        assertEquals(125, MainActivity.power(5, 3));
        assertEquals(625, MainActivity.power(5, 4));
        assertEquals(3125, MainActivity.power(5, 5));
    }
}