package de.gfn;

import java.util.Date;

// Statischer Import importiert nur das statische Inventar einer Klasse
import static java.lang.Math.*;
import static de.gfn.Wochentag.*;

public class InportTest {

    public static void main(String[] args) {

        // die importierte Klasse kann direkt über den Klassennamen verwendet werden
        Date d1 = new Date();

        // Nicht importierte Klassen müssen den vollen Namen ink. Package verwenden
        java.sql.Date d2 = null;


        System.out.println(Math.PI);
        System.out.println(Math.random());
        System.out.println((int)(Math.random() * 10) + 1); // Zufallswert zwischen 1 und 10
        System.out.println(Math.round(120.5678));

        System.out.println(PI);
        System.out.println(round(120.5678));

        Wochentag tag = Wochentag.MO;
        tag = DI;
    }
}
