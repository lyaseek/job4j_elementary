package ru.job4j.stream;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.util.Arrays;

import ru.job4j.stream.task249982.Address;
import ru.job4j.stream.task249982.Profile;
import ru.job4j.stream.task249982.Profiles;

public class ProfilesTest {
    @Test
    public void collectByAddress() {
        Profile profile = new Profile(new Address("Moscow", "Tverskaya", 5, 2));
        assertThat(new Profiles().collect(Arrays.asList(profile)).get(0).getCity(), is("Moscow"));
    }
}
