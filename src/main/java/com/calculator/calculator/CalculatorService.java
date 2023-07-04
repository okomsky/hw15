package com.calculator.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorInterface {
@Override
    public int sum(int sum1, int sum2) {
    return sum1 + sum2;
    }
    @Override
    public int minus(int sum1, int sum2) {
        return sum1 - sum2;
    }
    @Override
    public int multiply(int sum1, int sum2) {
        return sum1 * sum2;
    }
    @Override
    public int divide(int sum1, int sum2) {
        return sum1 / sum2;
    }
}
