package de.gfn.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

    public static void main(String[] args) {

        // System.in = Eingabestrom
        // System.out = Ausgabestrom
        // System.err = Ausgabestrom für Exceptions

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Zahl: ");
            int i = scanner.nextInt();
            int[] arr = new int[i];
            System.out.println(arr[3]);
        }
        catch(InputMismatchException e) {
            //e.printStackTrace();
            //System.out.println(e.getMessage()); // Standardnachricht
            System.out.println("Falsche Eingabe!");
        }
        catch(NegativeArraySizeException e) {
            System.out.println("Die Zahl darf nicht negativ sein!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Die Zahl ist zu klein.");
        }
        catch (RuntimeException e) {
            System.out.println("Problem!");
        }
        catch (Exception e) {
            System.out.println("Ernstes Problem!");
        }


        System.out.println("ENDE");

    }
}
