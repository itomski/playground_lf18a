package de.gfn.api;

public class Fahrzeug {

    private static int count;

    private int id;
    private String kennzeichen;
    private String marke;
    private String modell;
    private int baujahr;
    private boolean fahrbereit;

    public Fahrzeug(String kennzeichen, String marke, String modell, int baujahr) {
        id = ++count;
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.fahrbereit = true;
    }

    public Fahrzeug(String kennzeichen, String marke, String modell, int baujahr, boolean fahrbereit) {
        this(kennzeichen, marke, modell, baujahr);
        this.fahrbereit = fahrbereit;
    }

    public int getId() {
        return id;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public boolean isFahrbereit() {
        return fahrbereit;
    }

    public void setFahrbereit(boolean fahrbereit) {
        this.fahrbereit = fahrbereit;
    }

    @Override
    public String toString() {
        return "Fahrzeug{" +
                "id=" + id +
                ", kennzeichen='" + kennzeichen + '\'' +
                ", marke='" + marke + '\'' +
                ", modell='" + modell + '\'' +
                ", baujahr=" + baujahr +
                ", fahrbereit=" + fahrbereit +
                '}';
    }
}
