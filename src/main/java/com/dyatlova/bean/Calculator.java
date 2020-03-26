package com.dyatlova.bean;

import com.dyatlova.CalculationSign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private CalculationSign sum;
    private CalculationSign multiply;

    @Autowired
    public Calculator(@Qualifier("sum") CalculationSign sum,
                      @Qualifier("multiply") CalculationSign multiply) {
        this.sum = sum;
        this.multiply = multiply;
    }


    public void calculate(String sign, int a, int b) {
        if (sign.equals("+")) {
            sum.calculate(a, b);
        } else if (sign.equals("*")) {
                multiply.calculate(a, b);
            } else {

                System.out.println("Try again.");

            }

    }

}
