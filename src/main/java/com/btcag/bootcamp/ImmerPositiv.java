package com.btcag.bootcamp;

import java.util.Scanner;

public class ImmerPositiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gib eine Zahl ein: ");
        int num = scanner.nextInt();

        if (num >= 0) {
            System.out.println(num);
        } else {
            System.out.println(num * -1);
        }

    }
}
