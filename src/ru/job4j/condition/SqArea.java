package ru.job4j.condition;

//h = p / (2 * (k + 1));
//L = h * k;
//s = L * h;

public class SqArea {
    public static double square(int p, int k) {
        double rsl = p / (2 * (k + 1)) * (p / (2 * (k + 1)) * k);
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }

}