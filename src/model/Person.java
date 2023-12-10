package model;

import annotations.exercise_2.ClassAnnotation;

@ClassAnnotation
public class Person {
    private String name;
    private String surname;
    private String city;

    public void die() {
        System.out.println("Died...");
    }

    private Person(String name, String surname, String city) {
        this.name = name;
        this.surname = surname;
        this.city = city;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
