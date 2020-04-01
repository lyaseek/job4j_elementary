package ru.job4j.pojo;

public class Book {
    private String name;
    private int pagesNumbers;

    public Book(String name, int pagesNumbers) {
        this.name = name;
        this.pagesNumbers = pagesNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPagesNumbers() {
        return pagesNumbers;
    }

    public void setPagesNumbers(int pagesNumbers) {
        this.pagesNumbers = pagesNumbers;
    }
}
