package com.dyatlova;

public class Calculator {
    private CalculationSign sign;

    public Calculator(CalculationSign sign) {
        this.sign = sign;
    }

    public void calculate(int a, int b){
        System.out.println(a + sign.getSign() + b);
    }
}
