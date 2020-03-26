package com.dyatlova.impl;

import com.dyatlova.CalculationSign;
import org.springframework.stereotype.Component;

@Component
public class Sum implements CalculationSign {

    @Override
    public void calculate(int a, int b) {
        System.out.println(a + b);
    }
}
