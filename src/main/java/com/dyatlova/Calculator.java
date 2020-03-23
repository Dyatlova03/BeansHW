package com.dyatlova;

public class Calculator {
    private CalculationSign sign;

    public Calculator(CalculationSign sign) {
        this.sign = sign;
    }

    public void calculate(){
        System.out.println("sign " + sign.getSign());
    }
}
