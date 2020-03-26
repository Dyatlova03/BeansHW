package com.dyatlova;

import com.dyatlova.bean.Calculator;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.lang.reflect.Type;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Calculator calculator = context.getBean("calculator", Calculator.class);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter operation: ");
        String sign = scanner.nextLine();
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();

        calculator.calculate(sign, a, b);
        context.close();
    }
}
