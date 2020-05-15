package ru.job4j.collection.task250105;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] array1 = o1.split(". ");
        String[] array2 = o2.split(". ");
        return Integer.compare(Integer.parseInt(array1[0]), Integer.parseInt(array2[0]));
    }
}
