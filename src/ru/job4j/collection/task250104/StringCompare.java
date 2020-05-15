package ru.job4j.collection.task250104;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int rsl;
        char[] array1 = o1.toCharArray();
        char[] array2 = o2.toCharArray();
        for (int i = 0; i < Math.min(array1.length, array2.length); i++) {
            rsl = Character.compare(o1.charAt(i), o2.charAt(i));
            if (rsl != 0) {
                return rsl;
            }
        }
        return Integer.compare(array1.length, array2.length);
    }
}

