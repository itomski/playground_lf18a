package de.gfn;

/**
 * Definiert eine Person
 * @author Tomasz Lubowiecki
 * @since 24
 * @version 1.0
 */
public class Person implements Comparable<Person> {

    private String vorname;

    private String nachname;

    // Menü über Alt+Einf anzeigen

    public Person() {
    }

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    /**
     * Setzt den internen Zustand des Vornamens einer Person
     * @param vorname Der Vorname als Zeichenkette
     */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /**
     * Gibt den internen Zustand des Nachnamens einer Person zurück
     * @return Nachname als Zeichenkette
     */
    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    // Ersetzt die toString Methode aus Object
    // Beschreibung, wie Person zu String konvertiert wird
    @Override
    public String toString() {
        return vorname + ' ' + nachname;
    }

    @Override
    public int compareTo(Person other) { // Dieses Objekt wird mit einem anderen verglichen
        return nachname.compareTo(other.nachname);
    }
}
