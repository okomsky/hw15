package com.calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculator = new CalculatorService();
    @GetMapping("/")
    public String greating() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2) {
        return num1 + " + " + num2 + " = " + calculator.sum(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return String.valueOf(num1) + " - " + String.valueOf(num2) + " = " + calculator.minus(num1,num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return String.valueOf(num1) + " * " + String.valueOf(num2) + " = " + calculator.multiply(num1,num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        if (num2 == 0) {
           return "Делить на 0 нельзя";
        }
        return String.valueOf(num1) + " / " + String.valueOf(num2) + " = " + calculator.divide(num1,num2);
    }
}
