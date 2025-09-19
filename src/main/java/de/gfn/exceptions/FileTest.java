package de.gfn.exceptions;

import java.io.*;

public class FileTest {

    public static void main(String[] args) {



        try(Reader in = new FileReader("daten.txt");
                BufferedReader reader = new BufferedReader(in)) {
            String zeile = null;
            while((zeile = reader.readLine()) != null) {
                System.out.println(zeile);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Datei ist nicht da!");
        }
        catch (IOException e) {
            System.out.println("Lesen nicht möglich!");
        }


    }
}
