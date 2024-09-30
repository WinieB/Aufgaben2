package com.btcag.bootcamp;

import java.util.Scanner;

public class ImmerPositiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gib eine Zahl ein: ");
        int num = scanner.nextInt(); // Scannereingabe

        if (num >= 0) {
            System.out.println(num); // Wenn die Zahl größer oder 0 ist, wird diese wieder ausgegeben
        } else {
            System.out.println(num * -1); // Wenn nicht mit * -1 positiv gemacht
        }

    }
}
