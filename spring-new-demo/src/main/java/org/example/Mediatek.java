package org.example;

import org.springframework.stereotype.Component;

@Component
public class Mediatek implements Processor{
    @Override
    public void process(){
        System.out.println("Mediatek");
    }

}
