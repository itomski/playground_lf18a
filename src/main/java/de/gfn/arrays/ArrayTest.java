package de.gfn.arrays;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        int i = 10; // primitive Variable
        i = 20; // 10 ist verloren

        var j = 200; // Der Datentyp wird durch die erste Zuweisung bestimmt
        // j = 10.5; // Error

        int[] arr1 = {10, 20, 30, 40}; // Array mit 4 Werten
        int[] arr2 = new int[10]; // Ein lerres Array mit 10 Positionen

        // Arraypositionen (Index) beginnen bei 0
        arr1[3] = 50;
        //arr1[4] = 60; // ArrayIndexOutOfBoundsException: Zugriff auf einen nicht vorhandenen Index
        // In Java kann die Größe eines Arrays nachträglich NICHT verändert werden

        System.out.println(arr1[2]); // 30

        System.out.println();

        for (int k = 0; k < arr1.length; k++) {
            System.out.print(arr1[k] + ", ");
        }

        System.out.println();

        System.out.println(arr1);

//        System.out.println("Hallo".hashCode());
//        System.out.println(new String("Hallo").hashCode());

        System.out.println(Arrays.toString(arr1)); // Die Ausgabe des Arrays als ein String

        System.out.println();

        for(int zahl : arr1) {
            System.out.println(zahl);
        }

        System.out.println();

        // Lambdas
        Arrays.stream(arr1).forEach(zahl -> System.out.println(zahl));

    }
}
