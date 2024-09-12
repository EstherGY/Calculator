package com.example.calculator.Calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.calculator.Operation;

@Service
public class CalculatorService {
    private final Calculator calculator;

    @Autowired
    public CalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }

    public double performCalculation(Operation operation, double num1, double num2) {
        return calculator.calculate(operation, num1, num2);
    }
}
