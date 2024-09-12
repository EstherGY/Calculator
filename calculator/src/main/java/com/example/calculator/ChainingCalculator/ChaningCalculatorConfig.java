package com.example.calculator.ChainingCalculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChaningCalculatorConfig {
    @Bean
    public ChainingCalculator chainingCalculator() {
        // Create a ChainingCalculator with a default initial value
        return new ChainingCalculator(0.0);
    }
}
