package com.example.calculator.ChainingCalculator;

import org.springframework.stereotype.Service;

import com.example.calculator.CalculatorStrategy.CalculatorStrategy;

@Service
public class ChainingCalculatorService {
    private final ChainingCalculator chainingCalculator = new ChainingCalculator();


    public double performCalculation(CalculatorStrategy strategy, double operand) {
        return chainingCalculator.perform(strategy, operand).getResult();
    }
}
