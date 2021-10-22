package pro.sky.java.course2.lesson3.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.lesson3.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String showGreetings() {
        return "Добро пожаловать в калькулятор.";
    }

    @GetMapping("/plus")
    public String showSumOfTwoNumbers(@RequestParam int num1, @RequestParam int num2) {
        return String.format("%d + %d = %d", num1, num2, calculatorService.getSumOfTwoNumbers(num1, num2));
    }

    @GetMapping("/minus")
    public String showDifferenceOfTwoNumbers(@RequestParam int num1, @RequestParam int num2) {
        return String.format("%d - %d = %d", num1, num2, calculatorService.getDifferenceOfTwoNumbers(num1, num2));
    }

    @GetMapping("/multiply")
    public String showProductOfTwoNumbers(@RequestParam int num1, @RequestParam int num2) {
        return String.format("%d * %d = %d", num1, num2, calculatorService.getProductOfTwoNumbers(num1, num2));
    }

    @GetMapping("/divide")
    public String showQuotientOfTwoNumbers(@RequestParam int num1, @RequestParam int num2) {
        if (num2 == 0) {
            return "Деление на 0 недопустимо.";
        }
        return String.format("%d / %d = %f", num1, num2, calculatorService.getQuotientOfTwoNumbers(num1, num2));
    }
}
