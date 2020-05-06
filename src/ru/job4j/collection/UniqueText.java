package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = false;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        int count = 0;
        HashSet<String> check = new HashSet<>();
        for (String x : origin) {
            check.add(x);
        }
        for (String x : text) {
            if (check.contains(x)) {
                count++;
            }
        }
        if (count >= 0.7 * text.length) {
            rsl = true;
        }
        return rsl;
    }
}
