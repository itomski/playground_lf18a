package de.gfn.patterns.singleton;

public class SingletonTest {

    public static void main(String[] args) {

        //KundenNrGenerator gen = new KundenNrGenerator(); // nicht möglich! privater Konstruktor

        KundenNrGenerator gen = KundenNrGenerator.getInstance();
        System.out.println(gen.getLetzteKundenNr());
        System.out.println(gen.getLetzteKundenNr());
        System.out.println(KundenNrGenerator.getInstance().getLetzteKundenNr());

        doSomething();
    }

    private static void doSomething() {
        System.out.println(KundenNrGenerator.getInstance().getLetzteKundenNr());
    }
}
