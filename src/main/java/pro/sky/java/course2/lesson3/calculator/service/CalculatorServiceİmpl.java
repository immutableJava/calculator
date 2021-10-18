package pro.sky.java.course2.lesson3.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceİmpl implements CalculatorService {

    @Override
    public int getSumOfTwoNumbers(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public int getDifferenceOfTwoNumbers(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public int getProductOfTwoNumbers(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public String getQuotientOfTwoNumbers(int num1, int num2) {
        if (num2 == 0) {
            return "Деление на 0 недопустимо.";
        }
        return String.valueOf((double) num1 / num2);
    }
}
