package org.example;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
    @Override
    public void drive(){
        System.out.println("driving...Car");
    }

}
