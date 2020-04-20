package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        System.out.println(new Fact().calc(-6));
    }

    public int calc(int n) {
        int rsl = 1;
        if (n < 0) {
            throw new IllegalArgumentException("Argument n must be greater than 0");
        } else {
            for (int index = 1; index <= n; index++) {
                rsl *= index;
            }
        }
        return rsl;
    }
}