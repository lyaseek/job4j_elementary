package ru.job4j.calculator;

/**
 * Class that performs arithmetic operations + - * / .
 *
 * @author sokolova
 * @version 2.0
 * @since 10.03.2020
 */
public class Calculator {

    /**
     * Main
     *
     * @param args - args.
     */
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        int six = 6;
        int four = 4;
        int five = 5;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
    }
}