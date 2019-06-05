package com.epam.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        System.out.println("Calculator test");
        int expResult = 5;
        int result = Calculator.add(2,3);
        assertEquals(expResult, result);
    }
}