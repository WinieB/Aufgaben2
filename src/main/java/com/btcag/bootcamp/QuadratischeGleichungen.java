package com.btcag.bootcamp;

import java.util.Scanner;

public class QuadratischeGleichungen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scannereingabe für a, b, c
        System.out.println("Gibt dein a ein:");
        double a = scanner.nextDouble();

        System.out.println("Gibt dein b ein:");
        double b = scanner.nextDouble();

        System.out.println("Gibt dein c ein:");
        double c = scanner.nextDouble();

        // b² - 4ac > 0 = 2 Lösungen, < 0 = 0 Lösungen, = 0 = 1 Lösung
        if (b * b - 4 * a * c > 0) {
            System.out.println("2 Lösungen");
        } else if (b * b - 4 * a * c < 0) {
            System.out.println("0 Lösungen");
        } else {
            System.out.println("1 Lösung");
        }
    }
}
