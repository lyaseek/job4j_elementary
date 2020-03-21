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

        if ((right.length == 0) && (left.length == 0)) {
            return rsl;
        }

        while (i < rsl.length) {
            if (left[leftIndex] < right[rightIndex]) {
                rsl[i] = left[leftIndex];
                leftIndex++;
                if (leftIndex > left.length - 1) {
                    leftIndex--;
                    left[leftIndex] = right[rightIndex] + 1;
                }
                i++;
            } else {
                rsl[i] = right[rightIndex];
                rightIndex++;
                if (rightIndex > right.length - 1) {
                    rightIndex--;
                    right[rightIndex] = left[leftIndex] + 1;
                }
                i++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4});
        System.out.println(Arrays.toString(rsl));
    }
}