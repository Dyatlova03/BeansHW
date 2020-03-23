package com.dyatlova;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

       CalculationSign calculationSign = context.getBean("testBean", CalculationSign.class);
       Calculator calculator = new Calculator(calculationSign);
        System.out.println("Enter first number: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
       calculator.calculate(a, b);

        context.close();
    }
}
