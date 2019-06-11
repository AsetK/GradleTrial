package com.epam.helloworldgradle.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        int expResult = 5;
        int result = Calculator.add(2,4);
        assertEquals(expResult, result);
    }
}