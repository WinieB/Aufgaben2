package com.btcag.bootcamp;

public class FibonacciRekursiv {
    public static int a = 0;
    public static int b = 1;


    public static void main(String[] args) {
        System.out.print("0 1 "); // damit immer 0, 1 angezeigt wird
        fibonacci(1);
    }

    public static int fibonacci(int n) {
        n = a + b; // berechnung von Fibonacci
        a = b;
        b = n;

        if (n > 100) { // wie lange berechnet werden soll
            return 0; // rekursiven Aufruf stoppen
        } else { // ausgabe der Berechnung
            System.out.print(n + " ");
            return fibonacci(n);
        }
    }
}
