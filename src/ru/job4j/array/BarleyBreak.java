package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] table = new int[3][3];
        int a = 9;
        for (int i = 0; i < table.length; i++) {
            System.out.println();
            for (int j = 0; j < table.length; j++) {
                table[i][j] = a;
                System.out.print(table[i][j] + " ");
                a--;
            }
        }
    }
}
