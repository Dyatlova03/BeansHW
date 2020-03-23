package com.dyatlova;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

       CalculationSign calculationSign = context.getBean("testBean", CalculationSign.class);
       Calculator calculator = new Calculator(calculationSign);
       calculator.calculate();

        context.close();
    }
}
