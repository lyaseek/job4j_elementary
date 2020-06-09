package ru.job4j.stream.task249985;

import ru.job4j.stream.task249984.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixToList {
    public List<Integer> collect(Integer[][] matrix) {
        return Arrays.stream(matrix).flatMap(Arrays::stream).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Integer[][] matrix = new Integer[][]{
                new Integer[]{1, 2, 3},
                new Integer[]{4, 5, 6},
                new Integer[]{8, 10, 9}};
        MatrixToList matrixToList = new MatrixToList();
        System.out.println(matrixToList.collect(matrix));
    }
}
