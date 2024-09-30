package com.btcag.bootcamp;


public class Sortieren {
    public static void main(String[] args) {
        int[] array = {5, 13, 6, 8, 11}; // Array
        insertionSort(array); // Methode ausführen
        for (int num : array) { // for each Schleife damit durch das sortierte Array gegangen wird
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int[] array) { // Hier wird sortiert mit Insertion Sort
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];  // Hier wird das größere Element verschoben
                j--;
            }
            array[j + 1] = key;  // Hier wird der Schlüssel ein weiter gesetzt
        }
    }
}