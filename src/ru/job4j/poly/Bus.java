package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("drive");
    }

    @Override
    public void capacity(int passengers) {
        passengers++;
    }

    @Override
    public double refuel(int fuel) {
        return fuel * 2.0;
    }
}
