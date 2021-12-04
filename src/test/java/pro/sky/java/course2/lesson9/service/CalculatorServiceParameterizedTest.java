package pro.sky.java.course2.lesson9.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.java.course2.lesson3.calculator.service.CalculatorService;
import pro.sky.java.course2.lesson3.calculator.service.CalculatorServiceİmpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceParameterizedTest {
    private CalculatorService calculatorService;

    public static Stream<Arguments> provideParamsForSumTests() {
        return Stream.of(
                Arguments.of(1, 5, 6),
                Arguments.of(4, 6, 10),
                Arguments.of(7, 8, 15),
                Arguments.of(4, 9, 13));
    }

    public static Stream<Arguments> provideParamsForSubtractTests() {
        return Stream.of(
                Arguments.of(5, 3, 2),
                Arguments.of(7, 2, 5),
                Arguments.of(3, 9, -6),
                Arguments.of(1, 0, 1));
    }

    public static Stream<Arguments> provideParamsForMultiplyTests() {
        return Stream.of(
                Arguments.of(5, 5, 25),
                Arguments.of(7, 6, 42),
                Arguments.of(7, 8, 56),
                Arguments.of(4, 3, 12));
    }

    public static Stream<Arguments> provideParamsForDivideTests() {
        return Stream.of(
                Arguments.of(5, 5, 1),
                Arguments.of(30, 6, 5),
                Arguments.of(24, 8, 3),
                Arguments.of(1, 1, 1));
    }

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorServiceİmpl();
    }

    @ParameterizedTest
    @MethodSource("provideParamsForSumTests")
    public void shouldReturnCorrectSum(int num1, int num2, int result) {
        assertEquals(result, calculatorService.getSumOfTwoNumbers(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForSubtractTests")
    public void shouldReturnCorrectQuotient(int num1, int num2, int result) {
        assertEquals(result, calculatorService.getDifferenceOfTwoNumbers(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTests")
    public void shouldReturnCorrectProduct(int num1, int num2, int result) {
        assertEquals(result, calculatorService.getProductOfTwoNumbers(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTests")
    public void shouldReturn5WhenDivide25And5(int num1, int num2, int result) {
        assertEquals(result, calculatorService.getQuotientOfTwoNumbers(num1, num2));
    }
}
