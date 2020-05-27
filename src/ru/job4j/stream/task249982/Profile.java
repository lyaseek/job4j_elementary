package ru.job4j.stream.task249982;

import java.util.List;
import java.util.stream.Collectors;

public class Profile {
    private Address address;

    public static class Address {
        private String city;
        private String street;
        private int home;
        private int apartment;
    }

    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(profile -> profile.address).collect(Collectors.toList());
    }
}
