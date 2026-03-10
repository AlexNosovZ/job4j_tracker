package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        Predicate<Person> testPhone = (person) -> person.getPhone().contains(key);
        Predicate<Person> testName = (person) -> person.getName().contains(key);
        Predicate<Person> testSurname = (person) -> person.getSurname().contains(key);
        Predicate<Person> testAddress = (person) -> person.getAddress().contains(key);
        Predicate<Person> combine = testPhone.or(testName.or(testSurname.or(testAddress)));
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}