package de.gfn.api;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest3 {

    public static void main(String[] args) {

        List<Fahrzeug> liste = new ArrayList<>();

        liste.add(new Fahrzeug("HH:AB123", "Ford", "Ka", 2000));
        liste.add(new Fahrzeug("M:GX746", "Renault", "Scenic", 2015));
        liste.add(new Fahrzeug("B:FA557", "Mercedes", "A-Klasse", 2008));
        liste.add(new Fahrzeug("HH:XY345", "Ford", "Mustang", 1979, false));

        for(Fahrzeug f : liste) {
            //System.out.println(f.getKennzeichen());
            System.out.println(f.toString());
        }

        Fahrzeug fa = liste.get(2); // f ist eine Referenz auf das Objekt in der Liste
        fa.setFahrbereit(false);

        System.out.println();

        for(Fahrzeug f : liste) {
            //System.out.println(f.getKennzeichen());
            System.out.println(f.toString());
        }
    }

}
