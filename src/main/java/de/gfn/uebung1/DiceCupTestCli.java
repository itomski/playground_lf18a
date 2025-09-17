package de.gfn.uebung1;

import java.util.Arrays;
import java.util.Scanner;

public class DiceCupTestCli {

    private static final String KEYS = "\nWas willst du machen?\n" +
                                        "\t1 : Würfelfwurf mit einem Würfel\n" +
                                        "\t2 : Würfelfwurf mit mehreren Würfeln\n" +
                                        "\t0 : Programm verlassen\n";


    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        DiceCup cup = new DiceCup(6);

        app: while(true) {

            System.out.println(KEYS);

            System.out.print("Eingabe: ");
            int auswahl = scanner.nextInt();

            switch(auswahl) {
                case 0 -> { break app; }
                case 1 -> System.out.println("Dein Wurf: " + cup.roll());
                case 2 -> {
                    System.out.print("Wieviele würfeln? ");
                    int anzahl = scanner.nextInt();
                    System.out.println(Arrays.toString(cup.roll(anzahl)));
                }
                default -> System.out.println("Falsche Eingabe!");
            }
        }
    }
}
