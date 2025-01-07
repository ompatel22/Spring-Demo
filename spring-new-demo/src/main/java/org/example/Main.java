package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        //Samsung s21=(Samsung)ctx.getBean("samsung");
        //OR//
        Samsung s21=(Samsung)ctx.getBean(Samsung.class);
        s21.spec();
    }
}