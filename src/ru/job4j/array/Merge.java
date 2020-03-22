package ru.job4j.array;

import javax.swing.*;
import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftIndex = 0, rightIndex = 0, i = 0;

        if ((left.length == 0) && (right.length != 0)) {
            for (int j = 0; j < right.length; j++) {
                rsl[j] = right[j];
            }
            return rsl;
        }
        if ((right.length == 0) && (left.length != 0)) {
            for (int j = 0; j < left.length; j++) {
                rsl[j] = left[j];
            }
            return rsl;
        }
        while ((leftIndex + rightIndex) != rsl.length) {
            if (left[leftIndex] < right[rightIndex]) {
                rsl[leftIndex + rightIndex] = left[leftIndex];
                leftIndex++;
                if (leftIndex == left.length) {
                    while (rightIndex < right.length) {
                        rsl[rightIndex + leftIndex] = right[rightIndex];
                        rightIndex++;
                    }
                }
            } else {
                rsl[leftIndex + rightIndex] = right[rightIndex];
                rightIndex++;
                if (rightIndex == right.length) {
                    while (leftIndex < left.length) {
                        rsl[rightIndex + leftIndex] = left[leftIndex];
                        leftIndex++;
                    }
                }
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 2},
                new int[]{3, 4, 4});
        System.out.println(Arrays.toString(rsl));
    }
}