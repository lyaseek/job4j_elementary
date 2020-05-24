package ru.job4j.lambda.task249967;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Func {
    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> rsl = new ArrayList<>();
        Predicate<Integer> startLessThanEnd = x -> x < end;
        while (startLessThanEnd.test(start)) {
            rsl.add(func.apply((double) start));
            start++;
        }
        return rsl;
    }
}
