package com.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[][] menus = {
                {"Bakso", "1"},
                {"Sate", "3"},
                {"Soto", "2"},
                {"Rawon", "5"},
                {"Rujak", "3"}
        };
        tampilkanMenu(menus);
        int[][] tables = fillTables(10);
        for (int i = 0; i < tables.length; i++) {
            System.out.printf("Meja ke %d : ", i + 1);
            for (int j = 0; j < tables[i].length; j++) {
                System.out.print(menus[tables[i][j] - 1][0] + ",");
            }
            System.out.println();
        }
    }

    public static void tampilkanMenu(String[][] menus) {
        for (int i = 0; i < menus.length; i++) {
            System.out.printf("%d. %s (%s detik)\n", i + 1, menus[i][0], menus[i][1]);
        }
    }

    public static int[][] fillTables(int length) {
        Scanner sc = new Scanner(System.in);
        int[][] tables = new int[length][3];
        for (int i = 0; i < length; i++) {
            System.out.printf("Menu untuk meja %d : ", i + 1);
            String input = sc.nextLine();
            String[] inputSplit = input.split(",");
            int[] inputSplitInt = new int[3];
            for (int j = 0; j < inputSplit.length; j++) {
                inputSplitInt[j] = Integer.parseInt(inputSplit[j]);
            }
            tables[i] = inputSplitInt;
        }
        return tables;
    }
}
