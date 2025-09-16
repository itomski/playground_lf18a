package de.gfn;

import de.gfn.model.Person;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.size();

        Person p = new Person();
        p.setVorname("Peter");

        System.out.println(p.getNachname());


    }
}
