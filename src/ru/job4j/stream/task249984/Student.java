package ru.job4j.stream.task249984;

public class Student {
    private int score;
    private String surname;

    public Student(String surname, int score) {
        this.surname = surname;
        this.score = score;

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
