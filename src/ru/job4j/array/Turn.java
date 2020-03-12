package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 5, 3, 9};
        back(array);
        for (int x : array) {
            System.out.println(x);
        }
    }
}