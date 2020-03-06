package ru.job4j.ru.job4j.calculator;

//Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
//Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.

public class Fit {

    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(185);
        System.out.println("Man 185 is " + man);
        double woman = Fit.womanWeight(167);
        System.out.println("Woman 167 is " + woman);
    }

}
