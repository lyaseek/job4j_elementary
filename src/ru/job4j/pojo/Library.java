package ru.job4j.pojo;

import ru.job4j.array.SortSelected;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Anna Karenina", 489);
        Book book2 = new Book("Idiot", 322);
        Book book3 = new Book("Clean code", 120);
        Book book4 = new Book("Cooking", 86);
        Book[] arrayBooks = {book1, book2, book3, book4};
        for (int i = 0; i < arrayBooks.length; i++) {
            System.out.print("Name: " + arrayBooks[i].getName() + ", number of pages: " + arrayBooks[i].getPagesNumbers() + "; ");
        }
        System.out.println();
        Book book = arrayBooks[0];
        arrayBooks[0] = arrayBooks[3];
        arrayBooks[3] = book;
        for (int i = 0; i < arrayBooks.length; i++) {
            if (arrayBooks[i].getName().equals("Clean code")) {
                System.out.print("Name: " + arrayBooks[i].getName() + ", number of pages: " + arrayBooks[i].getPagesNumbers() + "; ");
            }
        }
    }
}
