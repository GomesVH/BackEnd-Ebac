package org.edu.java;

public class Person {
    private String name;
    private String gender;

    public Person(String nome, String gender) {
        this.name = nome;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
}