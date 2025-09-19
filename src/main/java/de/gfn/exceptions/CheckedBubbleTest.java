package de.gfn.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckedBubbleTest {

    public static void main(String[] args) {
        System.out.println("Start");
        try {
            method1();
        } catch (IOException e) {
            System.out.println("Problem wurde behandelt.");
        }
        System.out.println("Ende");
    }

    private static void method1() throws IOException {
        System.out.println("Start 1");
        method2();
        System.out.println("Ende 1");
    }

    private static void method2() throws IOException {
        System.out.println("Start 2");
        method3();
        System.out.println("Ende 2");
    }

    private static void method3() throws IOException {
        System.out.println("Start 3");
        Path pfad = Paths.get("data.abc");
        Files.lines(pfad).forEach(System.out::println);
        System.out.println("Ende 3");
    }
}
