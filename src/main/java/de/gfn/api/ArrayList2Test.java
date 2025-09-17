package de.gfn.api;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList2Test {

    public static void main(String[] args) {

        // Listen:
        // arbeiten mit einem Index
        // haben die Einfügereihenfolge // sind geordnet - nicht sortiert

        ArrayList<String> namen = new ArrayList<>();
        namen.add("Peter"); // Wird auf die nächste freie Stelle hinzugefügt
        namen.add("Bruce");
        System.out.println(namen);
        System.out.println(namen.get(1)); // Index beginnt mit 0
        namen.add(0, "Carol");
        System.out.println(namen);
        namen.add(1, "Natasha"); // Fügt an einer bestimmten Position ein
        System.out.println(namen);
        // System.out.println(namen.get(5)); // IndexOutOfBoundsException
        namen.set(2, "Steve"); // Element wird ersetzt
        System.out.println(namen);
        System.out.println(namen.size());

        System.out.println();
        for(int i = 0; i < namen.size(); i++) {
            System.out.println(namen.get(i));
        }

        System.out.println();
        for(String name : namen) {
            System.out.println(name);
        }

        System.out.println();
        namen.forEach(e -> System.out.println(e)); // Seit Java 1.9

        namen.clear(); // Liste wird geleert
        System.out.println(namen);

        System.out.println();

        // Generische Typen MÜSSEN Komplex sein

        // byte, short, int, long, float, double
        // Byte, Short, Integer, Long, Float, Double

        // char, boolean
        // Character, Boolean

        ArrayList<Integer> zahlen = new ArrayList<>();
        zahlen.add(100); // Autoboxing von int zu Integer
        int i = zahlen.get(0); // Auto-Unboxing

        // Referenztyp: List<Integer> - Typ für die Verlinkung
        // Objekttyp: ArrayList<> - Indentität des Objekts auf dem Heap
        List<Integer> werte = new ArrayList<>();
        werte = new LinkedList<>();

        werte = new ArrayList<>(100); // Vorgabe für die Größe des internen Arrays

        // Fügt alle Elemente in die ArrayList ein
        werte.addAll(List.of(10,22,17,19,8,12,99,7));

        werte.add(9, 100);
        System.out.println(werte);

    }
}
