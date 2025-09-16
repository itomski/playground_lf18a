package de.gfn;

import de.gfn.model.Person;

import java.util.Comparator;

public class PersonVornameComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getVorname().compareTo(p2.getVorname());
    }
}
