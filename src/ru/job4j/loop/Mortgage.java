package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        int FeeProYear = 0;
        percent = percent * 0.01;
        amount = (int) (amount * percent + amount);
        while (amount > 0) {
            amount = (amount - salary) + FeeProYear;
            FeeProYear = (int) (amount * percent);
            year++;
        }
        return year;
    }

}