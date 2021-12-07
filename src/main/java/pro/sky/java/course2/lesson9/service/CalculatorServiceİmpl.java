package pro.sky.java.course2.lesson9.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceİmpl implements CalculatorService {

    @Override
    public int getSumOfTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int getDifferenceOfTwoNumbers(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int getProductOfTwoNumbers(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public double getQuotientOfTwoNumbers(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на 0 недопустимо.");
        }
        return (double) num1 / num2;
    }
}
