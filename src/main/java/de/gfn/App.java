package de.gfn;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    // Klassenvariablen: stehen allen Methoden zur Verfügung
    private static final ArrayList<String> todos = new ArrayList<>(); // eine leere Liste
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        app: while(true) { // app ist ein Label

            System.out.print("Option: ");
            String input = scanner.next().trim().toLowerCase();

            // Schreibweise mit -> macht automatisch ein break nach jedem case
            switch(input) {
                case "list" -> showTodos();
                case "neu" -> newTodo();
                case "exit" -> {
                    System.out.println("Programm verlassen...");
                    break app; // bricht die Struktur mit dem Label app ab
                }
                default -> System.out.println("Falsche Eingabe...");
            }
        }
        System.out.println("Ende!");
    }

    private static void showTodos() {
        System.out.println("Todos:");
        for(String todo : todos) {
            System.out.println(todo);
        }
        System.out.println();
    }

    private static void newTodo() {
        scanner.nextLine(); //fix
        System.out.print("Todo: ");
        todos.add(scanner.nextLine()); // liest die komplette Zeile ein
        System.out.println("Gespeichert");
        System.out.println();
    }
}
