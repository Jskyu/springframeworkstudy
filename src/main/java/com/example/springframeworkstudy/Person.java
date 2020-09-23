package com.example.springframeworkstudy;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Person {

    private String name;
    private int age;
    private String country;

    public Person(String name, int age, String country){
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public Person(){

    }
}
