package de.gfn.api;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class StringFormatTest {

    public static void main(String[] args) {

        List<Termin> termine = new ArrayList<>();
        termine.add(new Termin(LocalTime.of(15, 15), "Essen mit Bruce", "Bla bla bla"));
        termine.add(new Termin(LocalTime.of(10, 0), "Teammeeting", "Bla bla bla"));
        termine.add(new Termin(LocalTime.of(19, 0), "Feierabend", "Bla bla bla"));

        final String ROW_TPL = "| %6s | %-20s | %25s |\n";

        System.out.printf(ROW_TPL, "TAG", "TITEL", "BESCHREIBUNG");
        for(Termin t : termine) {
            //System.out.println(t.getZeit() + " | " + t.getTitel() + " | " + t.getBeschreibung());
            System.out.printf(ROW_TPL, t.getZeit(), t.getTitel(), t.getBeschreibung());
        }

        Locale.setDefault(Locale.FRANCE);

        double preis = 10217.29956;
        System.out.println(preis);
        System.out.printf("%.2f\n", preis); // Gibt den formatierten String auf der Konsole aus
        String formStr = String.format("%.2f\n", preis); // Liefert den formatierten String zurück
        System.out.println(formStr);

        System.out.println();

        final Scanner scanner = new Scanner(System.in);

        System.out.print("Eingabe: ");
        String eingabe = scanner.next();

        String[] teile = eingabe.toUpperCase().split(""); // Nach Zeichen

        for(String zeichen : teile) {
            switch(zeichen) {
                case ">" -> System.out.println("Vorwärts");
                case "<" -> System.out.println("Rückwärts");
                case "L" -> System.out.println("Nach links");
                case "R" -> System.out.println("Nach rechts");
                default -> System.out.println("Ungültig");
            }
        }

        System.out.println(Integer.toBinaryString(5235));
        int zahl = 0b10110111;
        System.out.println(zahl);
    }
}
