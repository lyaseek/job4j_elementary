package ru.job4j.lambda.task249967.task249968;

import org.junit.Test;
import ru.job4j.lambda.task249968.Person;
import ru.job4j.lambda.task249968.PhoneDictionary;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Bryansk");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
}
