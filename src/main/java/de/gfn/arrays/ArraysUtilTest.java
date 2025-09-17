package de.gfn.arrays;

import de.gfn.model.Person;

import java.util.Arrays;
import java.util.Comparator;


public class ArraysUtilTest {

    public static void main(String[] args) {

        int[] arr1 = new int[20];
        System.out.println(arr1);

        String strArr = Arrays.toString(arr1); // Konvertiert das Array in einen String
        System.out.println(strArr);

        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1));

        Arrays.fill(arr1, 5, 15, 20);
        System.out.println(Arrays.toString(arr1));

        arr1[5] = 100;
        arr1[1] = 1000;
        arr1[10] = 12;
        arr1[17] = -1;
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        // Array muss für binarySearch sortiert sein
        System.out.println(Arrays.binarySearch(arr1, -5));

        int[] arr2 = {7,3,22,18};
        int[] arr3 = {7,3,22,20};

        // Sind beide Arrays gleich?
        System.out.println(Arrays.equals(arr2, arr3));
        System.out.println(Arrays.mismatch(arr2, arr3));

        System.out.println();

        Person[] personen = new Person[5];
        personen[0] = new Person("Peter", "Parker");
        personen[1] = new Person("Bruce", "Banner");
        personen[2] = new Person("Carol", "Danvers");
        personen[3] = new Person("Tony", "Stark");
        personen[4] = new Person("Natasha", "Romanov");

        System.out.println(Arrays.toString(personen));

        //Arrays.sort(personen);

        // int compare(T o1, T o2);
        // Lambdas basieren auf Interfaces mit einer einzigen abstrakten Methode
        // SAM = Single Abstract Method
        Comparator<Person> nachVorname = (p1, p2) -> p1.getVorname().compareTo(p2.getVorname());

        Arrays.sort(personen, nachVorname);

        // Arrays.sort(personen, new PersonVornameComparator());

        System.out.println(Arrays.toString(personen));
    }
}
