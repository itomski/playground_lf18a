package de.gfn.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) {

        File dir = new File("data");
        File file = new File(dir,"zeug.txt");

        try {

            if (!dir.exists()) {
                dir.mkdir();
            }

            if (!file.exists()) {
                file.createNewFile();
            }

            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());

        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

        File root = new File("./");
        for(String element : root.list()) {
            System.out.println(element);
        }

        /*
        InputStream // Bytes einlesen
        OutputStream // Bytes schreiben
        Reader // Zeichen lesen
        Writer // Zeichen schreiben
        */

        try(BufferedWriter out = new BufferedWriter(new FileWriter("data/zeug.txt", true))) {

            out.append("Bla bla bla...");
            out.newLine();
            out.flush();
            // out wird automatisch geschlossen
        }
        catch (IOException e) {
            System.out.println("Problem beim Schreiben!");
        }


    }

}
