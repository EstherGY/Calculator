package com.example.calculator.CalculatorStrategy;

import org.springframework.stereotype.Component;

@Component
public class Addition implements CalculatorStrategy {
    @Override
    public double apply(double value1, double value2) {
        return value1 + value2;
    }
}
