package de.gfn.uebung1;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceCupTest {

    //@Test
    @RepeatedTest(value = 100, name="Wurf {currentRepetition} von {totalRepetitions}")
    void rollW10() {
        DiceCup cup = new DiceCup(10);
        int value = cup.roll();
        assertTrue(value > 0 && value <= 10);
    }

    @Test
    void rollW6() {
        DiceCup cup = new DiceCup(6);
        int value = cup.roll();
        assertTrue(value > 0 && value <= 6);
    }

//    @Test
//    void testRoll() {
//    }
}