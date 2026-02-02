package com.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    private MathUtils math;

    @BeforeEach
    void setUp() {
        math = new MathUtils();
    }

    @AfterEach
    void tearDown() {
        math = null;
    }

    @Test
    void testAdd() {
        assertEquals(5, math.add(2, 3));
        assertEquals(0, math.add(-2, 2));
        assertEquals(-5, math.add(-2, -3));
    }

    @Test
    void testSubtract() {
        assertEquals(-1, math.subtract(2, 3));
        assertEquals(4, math.subtract(2, -2));
        assertEquals(0, math.subtract(10, 10));
    }

    @Test
    void testMultiply() {
        assertEquals(6, math.multiply(2, 3));
        assertEquals(0, math.multiply(10, 0));
        assertEquals(-6, math.multiply(2, -3));
    }

    @Test
    void testDivide() {
        assertEquals(2.5, math.divide(5, 2), 0.0001);
        assertEquals(-1.0, math.divide(5, 0), 0.0001);
        assertEquals(-2.0, math.divide(6, -3), 0.0001);
    }
}
