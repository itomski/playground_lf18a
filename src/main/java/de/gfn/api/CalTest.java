package de.gfn.api;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class CalTest {

    public static void main(String[] args) {

        Map<LocalDate, TreeSet<Termin>> cal = new TreeMap<>();

        cal.put(LocalDate.now(), new TreeSet<>((t1, t2) -> t1.getZeit().compareTo(t2.getZeit())));
        cal.get(LocalDate.now()).add(new Termin(LocalTime.of(15, 15), "Essen mit Bruce", "Bla bla bla"));
        cal.get(LocalDate.now()).add(new Termin(LocalTime.of(10, 0), "Teammeeting", "Bla bla bla"));
        cal.get(LocalDate.now()).add(new Termin(LocalTime.of(19, 0), "Feierabend", "Bla bla bla"));

        System.out.println(cal);

        System.out.println();

        LocalDate tag = LocalDate.now();

        for(Termin t : cal.get(tag)) {
            System.out.println(t);
        }
    }
}
