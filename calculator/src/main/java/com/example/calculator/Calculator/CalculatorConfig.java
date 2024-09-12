package com.example.calculator.Calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfig {
    @Bean
    public Calculator calculator() {
        return new Calculator();
    }
}
