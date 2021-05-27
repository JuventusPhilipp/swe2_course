package ch.juventus.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        sortPeople();
    }

    public static void sortPeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Hans", "Muster"));
        people.add(new Person("Peter", "Keller"));
        people.add(new Person("Peter", "Kuster"));
        people.add(new Person("Lisa", "Muster"));

        Collections.sort(people, new NameComparator());

        people.forEach(System.out::println);
    }

}
