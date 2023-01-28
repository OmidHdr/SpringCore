package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bus implements Veicle{
    @Override
    public void drive() {
        System.out.println("Bus Driving");
    }
}
