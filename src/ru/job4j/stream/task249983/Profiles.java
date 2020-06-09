package ru.job4j.stream.task249983;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(Profile::getAddress).sorted(new SortByCity()).distinct().collect(Collectors.toList());
    }
}
