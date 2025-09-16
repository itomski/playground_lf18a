package de.gfn;

import de.gfn.model.Person;

import java.util.Arrays;

public class ArrayTest2 {

    public static void main(String[] args) {

        int[] arr1 = {5,7,22,18,0,-7,99};

        String[] arr2 = {"Peter", "Bruce", "Carol", "Natasha", "Scott"};

        Person[] arr3 = new Person[5]; // Leeres Array mit 5 Positionen
        arr3[0] = new Person("Peter", "Perker");
        arr3[1] = new Person("Bruce", "Banner");
        arr3[2] = new Person("Carol", "Danvers");
        arr3[3] = new Person("Natasha", "Romanov");
        arr3[4] = new Person("Scott", "Lang");

        arr3[1] = new Person("Steve", "Rogers"); // Bruce Banner wird überschrieben

        for(Person p: arr3) {
            // Ruft automatisch die toString-Methode auf
            //System.out.println(p); // Java konvertiert hier die Person zu String
            System.out.println(p.toString());
        }

        System.out.println(); // Leerzeile

        System.out.println(Arrays.toString(new int[]{10, 20, 30, 40}));
        // Array hier nicht mehr verfügbar


    }
}
