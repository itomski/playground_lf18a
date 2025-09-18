package de.gfn.api;

import java.time.LocalTime;

public class Termin {

    private LocalTime zeit;
    private String titel;
    private String beschreibung;

    public Termin() {
    }

    public Termin(LocalTime zeit, String titel, String beschreibung) {
        this.zeit = zeit;
        this.titel = titel;
        this.beschreibung = beschreibung;
    }

    public LocalTime getZeit() {
        return zeit;
    }

    public void setZeit(LocalTime zeit) {
        this.zeit = zeit;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Termin{");
        sb.append("zeit=").append(zeit);
        sb.append(", titel='").append(titel).append('\'');
        sb.append(", beschreibung='").append(beschreibung).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
