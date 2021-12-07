package pro.sky.java.course2.lesson9.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.java.course2.lesson3.calculator.service.CalculatorService;
import pro.sky.java.course2.lesson3.calculator.service.CalculatorServiceİmpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {
    private CalculatorService calculatorService;

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorServiceİmpl();
    }

    @Test
    public void shouldReturn11WhenSum5And6() {
        int num1 = 5;
        int num2 = 6;
        int result = 11;
        assertEquals(result, calculatorService.getSumOfTwoNumbers(num1, num2));
    }

    @Test
    public void shouldReturn18WhenSum5And13() {
        int num1 = 5;
        int num2 = 13;
        int result = 18;
        assertEquals(result, calculatorService.getSumOfTwoNumbers(num1, num2));
    }


    @Test
    public void shouldReturn1WhenSubtract6And5() {
        int num1 = 6;
        int num2 = 5;
        int result = 1;
        assertEquals(result, calculatorService.getDifferenceOfTwoNumbers(num1, num2));
    }

    @Test
    public void shouldReturn8WhenSubtract10And2() {
        int num1 = 10;
        int num2 = 2;
        int result = 8;
        assertEquals(result, calculatorService.getDifferenceOfTwoNumbers(num1, num2));
    }

    @Test
    public void shouldReturn25WhenMultiply5And5() {
        int num1 = 5;
        int num2 = 5;
        int result = 25;
        assertEquals(result, calculatorService.getProductOfTwoNumbers(num1, num2));
    }

    @Test
    public void shouldReturn56WhenMultiply7And8() {
        int num1 = 7;
        int num2 = 8;
        int result = 56;
        assertEquals(result, calculatorService.getProductOfTwoNumbers(num1, num2));
    }

    @Test
    public void shouldThrowExceptionWhenDivideBy0() {
        int num1 = 1;
        int num2 = 0;
        assertThrows(IllegalArgumentException.class, () -> calculatorService.getQuotientOfTwoNumbers(num1, num2));
    }

    @Test
    public void shouldReturn5WhenDivide25And5() {
        int num1 = 25;
        int num2 = 5;
        int result = 5;
        assertEquals(result, calculatorService.getQuotientOfTwoNumbers(num1, num2));
    }

    @Test
    public void shouldReturn16WhenDivide64And4() {
        int num1 = 64;
        int num2 = 4;
        int result = 16;
        assertEquals(result, calculatorService.getQuotientOfTwoNumbers(num1, num2));
    }
}
