package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Veicle obj = context.getBean(Car.class);
        obj.drive();

        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();

        ApplicationContext annotaion = new AnnotationConfigApplicationContext(BeanConfig.class);
        Bus bus = annotaion.getBean(Bus.class);
        bus.drive();

        Nurse nurse = annotaion.getBean(Nurse.class);
        nurse.assist();

    }
}