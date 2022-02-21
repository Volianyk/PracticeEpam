package com.epam.spring.homework1;

import com.epam.spring.homework1.config.BeanConfig;
import com.epam.spring.homework1.pet.Pet;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Homework1Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Pet pet = context.getBean(Pet.class);
        pet.printPets();
    }
}
