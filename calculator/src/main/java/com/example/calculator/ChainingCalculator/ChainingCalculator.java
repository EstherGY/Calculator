package com.example.calculator.ChainingCalculator;

import org.springframework.stereotype.Component;

import com.example.calculator.CalculatorStrategy.CalculatorStrategy;

@Component
public class ChainingCalculator {
    private double currentValue;

    public ChainingCalculator() {
        this.currentValue = 0.0; // Default initial value
    }

    public ChainingCalculator(double initialValue) {
        this.currentValue = initialValue;
    }

    public ChainingCalculator perform(CalculatorStrategy strategy, double operand) {
        this.currentValue = strategy.apply(this.currentValue, operand);
        return this;
    }

    public double getResult() {
        return this.currentValue;
    }
}
