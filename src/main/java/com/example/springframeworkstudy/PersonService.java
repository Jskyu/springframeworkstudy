package com.example.springframeworkstudy;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    private final List<Person> personList = new ArrayList<>();

    public PersonService(){
        personList.add(new Person("정성규", 24, "KR"));
        personList.add(new Person("홍길동", 23, "KR"));
        personList.add(new Person("Denis", 29, "US"));
    }

    public void save(Person person){
        personList.add(person);
    }

    public Person findOne(String name){
        for(Person person : personList){
            if(person.getName().equals(name)){
                return person;
            }
        }
        return null;
    }

    public List<Person> findAll(){
        return personList;
    }
}
