package ru.job4j.lambda.task249209;

import ru.job4j.lambda.task249972.Attachment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SearchAtt {
    public static List<Attachment> filter(List<Attachment> list, Object o) {
        Supplier<List<Attachment>> filterList = new Supplier<List<Attachment>>() {
            @Override
            public List<Attachment> get() {
                List<Attachment> rsl = new ArrayList<>();
                for (Attachment x : list) {
                    if (o instanceof String ? (x.getName().contains((String) o)) : x.getSize() > (Integer) o) {
                        rsl.add(x);
                    }
                }
                return rsl;
            }
        };
        return filterList.get();
    }
}
