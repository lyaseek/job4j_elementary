package ru.job4j.search;

import java.util.ArrayList;
import ru.job4j.search.Person;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (var x : persons) {
            if ((x.getAddress().contains(key)) || (x.getName().contains(key)) || (x.getSurname().contains(key)) || (x.getPhone().contains(key))) {
                result.add(x);
            }
        }
        return result;
    }

}