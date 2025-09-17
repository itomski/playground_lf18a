package de.gfn;

public class VariablenTest {

    // Instanzvariable: Ist verfügbar solange das Objekt vorhanden ist
    private int zahl;

    // Klassenvariable: Ist verfügbar ab dem Laden der Klasse bis zum Ende des Programms
    private static int andereZahl;

    public static void main(String[] args) {

        // Lokale variable
        int zahl = 1;

        System.out.println(zahl); // Lokale Variable müssen vor der Verwendung einen Wert bekommen
        System.out.println(andereZahl); // Klassenvariablen bekommen einen defaultwert

        // Instanzvariablen bekommen einen defaultwert
        System.out.println(new VariablenTest().zahl);
    }

    // Instanzmethode
    public void machWas() {
        // Lokale variable
        int zahl = 1; // Verdeckt die Instanzvariable
        System.out.println(zahl);
        System.out.println(this.zahl); // this erlaubt zugriff auf eine verdeckte Instanzvariable
    }
}
