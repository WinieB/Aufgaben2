package com.btcag.bootcamp;

import java.util.Scanner;

public class VierGewinnt {


    // -------------- Hier wird noch gearbeitet :) -------------


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(playerNames(1, sc));
        System.out.println(playerNames(2, sc));
    }

    public static String playerNames(int num, Scanner sc) {
        System.out.println("Spieler " + num + " bitte gib deinen Namen ein: ");
        String n1 = "";

        do {
            n1 = sc.nextLine();
            if (n1.length() < 3 || n1.length() > 15) {
                System.out.println("Der Name ist ungültig. Bitte gib einen neuen Namen ein:");
            }
        }
        while (n1.length() < 3 || n1.length() > 15);


        return n1;
    }
}
