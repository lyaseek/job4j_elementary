package ru.job4j.array;

/**
 * - Массив на 10 элементов типа short с именем ages.
 * - Массив на 100500 элементов типа String c именем surnames.
 * - Массив на 40 элементов типа float с именем prices.
 */
public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        names[0] = "Ivan Ivanov";
        names[1] = "Petr Petrov";
        names[2] = "Andrey Smirnov";
        names[3] = "Ivan Petrov";

        for (String x : names) {
            System.out.println(x);
        }
    }
}
