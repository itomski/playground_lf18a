package de.gfn;

public class Person {

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

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

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
}
