package ru.job4j.stream;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.*;

import ru.job4j.stream.task249983.Address;
import ru.job4j.stream.task249983.Profile;
import ru.job4j.stream.task249983.Profiles;

import java.util.Arrays;
import java.util.List;

public class ProfilesSortByCityTest {
    @Test
    public void collectSortByCity() {
        List<Profile> list = Arrays.asList(new Profile(new Address("Moscow", "Tverskaya", 5, 2)),
                new Profile(new Address("Belgorod", "Lenina", 6, 2)), new Profile(new Address("Moscow", "Tverskaya", 5, 2)));
        assertThat(new Profiles().collect(list).get(0).getCity(), is("Belgorod"));
    }
}
