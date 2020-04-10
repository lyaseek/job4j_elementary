package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int amount = 11;
        int moveAmount;
        int n = 1;
        Scanner scanner = new Scanner(System.in);
        while (amount > 0) {
            if (n % 2 == 0) {
                System.out.println("Make a move second player");
            } else {
                System.out.println("Make a move first player");
            }
            try {
                moveAmount = Integer.parseInt(scanner.nextLine());
                if ((moveAmount > 3) || (moveAmount <= 0)) {
                    System.out.println("Invalid number of matches");
                } else {
                    amount = amount - moveAmount;
                    n++;
                    System.out.println(amount + " matches left");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid symbol");
            }
        }
        if ((n - 1) % 2 == 0) {
            System.out.println("Second player won");
        } else {
            System.out.println("First player won");
        }
    }
}
