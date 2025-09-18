package de.gfn.api;

import de.gfn.Todo;

import java.util.*;

public class HashCodeTest {

    public static void main(String[] args) {

        Todo t1 = new Todo("Einkaufen");
        Todo t2 = new Todo("Einkaufen");

        System.out.println(t1);
        System.out.println(t2);

        System.out.println(t1 == t2); // Ist es das gleiche Objekt auf dem Heap?
        System.out.println(t1.equals(t2)); // Hat es den gleichen Inhalt?

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());


        Set<Todo> menge = new HashSet<>();
        menge.add(t1);
        menge.add(t2);
        System.out.println(menge);

        List<Todo> liste = new ArrayList<>(menge);
        System.out.println(liste);

        System.out.println();

        // Warteschlange
        Queue<Todo> todos = new LinkedList<>();
        todos.offer(new Todo("Backen"));
        todos.offer(new Todo("Einkaufen"));
        todos.offer(new Todo("Teammeeting"));
        todos.offer(new Todo("Bugfixing"));

        System.out.println(todos);

        while(!todos.isEmpty()) {
            System.out.println(todos.poll());
        }

        System.out.println(todos);

        // Maps
        Map<String, Integer> einwohner = new HashMap<>();
        einwohner.put("Hamburg", 1_900_000);
        einwohner.put("München", 1_600_000);
        einwohner.put("Berlin", 2_400_000);
        einwohner.put("Leipzig", 1_200_000);

        System.out.println(einwohner);
        System.out.println(einwohner.get("Berlin"));
        System.out.println(einwohner.getOrDefault("Leipzig", 0));
    }
}
