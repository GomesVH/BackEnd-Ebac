package org.edu.java;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestFemaleGender {
    @Test
    public void onlyFemaleGender() {
        Set<PersonTest> setPersons = new HashSet<>();

        PersonTest personTest1 = new PersonTest("Jhon", "Male");
        PersonTest personTest2 = new PersonTest("Mary", "Female");
        PersonTest personTest3 = new PersonTest("Daisy", "Female");

        setPersons.add(personTest1);
        setPersons.add(personTest2);
        setPersons.add(personTest3);

        Assert.assertEquals(3, setPersons.size());

        List<PersonTest> femalePersons = MainTest.filterFemaleNames(setPersons);

        Assert.assertEquals(2, femalePersons.size());

        femalePersons.forEach(p -> Assert.assertEquals("Female", p.getGender()));
    }
}