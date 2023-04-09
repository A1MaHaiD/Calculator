package com.goit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    public void testSumOfOne() {
        int result = calculator.sum(1);
        assertEquals(1, result);
    }

    @Test
    public void testSumOfThree() {
        int result = calculator.sum(3);
        assertEquals(6, result);
    }

    @Test
    public void testSumOfZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.sum(0);
        });
    }
}