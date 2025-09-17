package de.gfn.uebung1;

import java.util.Random;

public class DiceCup {

    private final int FACES;
    private final Random RAND = new Random();

    public DiceCup(int faces) {
        this.FACES = faces;
    }

    public DiceCup() {
        this.FACES = 6;
    }

    public int roll() {
        return RAND.nextInt(FACES) + 1;
    }

    public int[] roll(int count) {
        int[] results = new int[count];
        for(int i = 0; i < count; i++) {
            results[i] = roll();
        }
        return results;
    }
}
