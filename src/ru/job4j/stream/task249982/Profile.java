package ru.job4j.stream.task249982;

import java.util.List;
import java.util.stream.Collectors;

public class Profile {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public Profile(Address address) {
        this.address = address;
    }
}
