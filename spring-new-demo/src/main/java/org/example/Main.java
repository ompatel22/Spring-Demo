package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/spring.xml");
        Vehicle vehicle = (Vehicle) context.getBean("bike");
        vehicle.drive();

        Tyre tyre = (Tyre) context.getBean("tyre_idx");
        System.out.println(tyre.getBrand());
    }
}