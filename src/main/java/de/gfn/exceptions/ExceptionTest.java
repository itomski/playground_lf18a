package de.gfn.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Unchecked: Exception, die zur Laufzeit auftreten sind RuntimeExceptions

        while(true) {
            try {
                System.out.print("Gewünschte Zahl: ");
                int zahl = scanner.nextInt(); // InputMismatchException
                System.out.println(zahl);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ungültiger Wert");
                scanner.nextLine(); // Fix: Leert den Buffer
            }
        }

        // IO oder NIO

        // Checked: Exceptions, zu deren Behandlung uns der Kompiler zwingt

        Path pfad = Paths.get("daten_.txt");
        try {
            List<String> zeilen = Files.readAllLines(pfad);
            for(String zeile : zeilen) {
                System.out.println(zeile.toLowerCase());
            }
        }
        catch (IOException e) {
            System.out.println("Probleme beim Lesen der Daten.");
        }
    }
}
