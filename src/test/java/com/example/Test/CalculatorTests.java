package com.example.Test;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;

@SpringBootTest
public class CalculatorTests {

    @Autowired
    private Calculator calculator;

    @Test
    public void test1() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void test2() {

        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 1, 2, 3, 4, 5 };

        assertArrayEquals(arr1, arr2);
    }

    @Test
    public void test3() {

        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = arr1;

        assertArrayEquals(arr1, arr2);
    }

}