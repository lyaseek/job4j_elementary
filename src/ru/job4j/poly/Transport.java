package ru.job4j.poly;

public interface Transport {
    void drive();

    void capacity(int passengers);

    double refuel(int fuel);
}
