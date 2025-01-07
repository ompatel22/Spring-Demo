package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mySamsung") //by default=> samsung
public class Samsung {
    @Autowired
    //@Qualifier("mediatek")
    Processor processor;
    public void spec(){
        System.out.println("8gb RAM/64gb ROM");
        processor.process();
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
}
