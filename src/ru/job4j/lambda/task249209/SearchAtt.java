package ru.job4j.lambda.task249209;

import ru.job4j.lambda.task249972.Attachment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SearchAtt {
    public static List<Attachment> filter(List<Attachment> list, Predicate<Attachment> filter) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (filter.test(att)) {
                rsl.add(att);
            }
        }
        System.out.println(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        List<Attachment> list = Arrays.asList(new Attachment("Abug", 120), new Attachment("Bbb", 30), new Attachment("Nnbugd", 100));
        Predicate<Attachment> containsBug = t -> t.getName().contains("bug");
        Predicate<Attachment> moreThan100 = t -> t.getSize() > 100;
        SearchAtt.filter(list, containsBug);
        SearchAtt.filter(list, moreThan100);
    }
}
