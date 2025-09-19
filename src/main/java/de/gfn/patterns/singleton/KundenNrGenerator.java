package de.gfn.patterns.singleton;

public class KundenNrGenerator {

    // EagerSingleton
    // private final static KundenNrGenerator instance = new KundenNrGenerator();

    // LazySingleton
    private static KundenNrGenerator instance;

    private int letzteKundenNr = 100;

    private KundenNrGenerator() {
    }

    // EagerSingleton
//    public static KundenNrGenerator getInstance() {
//        return instance;
//    }

    // Lazy Singleton
    public static KundenNrGenerator getInstance() {
        if(instance == null) {
            instance = new KundenNrGenerator();
        }
        return instance;
    }

    public int getLetzteKundenNr() {
        return ++letzteKundenNr;
    }
}
