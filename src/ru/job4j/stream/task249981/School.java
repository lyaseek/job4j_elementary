package ru.job4j.stream.task249981;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    public static class Student {
        private int score;
        private String surname;

        public Student(int score, String surname) {
            this.score = score;
            this.surname = surname;
        }

        public int getScore() {
            return score;
        }

        public String getSurname() {
            return surname;
        }

        @Override
        public String toString() {
            return "Student{" + "score=" + score + ", surname='" + surname + '\'' + '}';
        }
    }

    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }
}
