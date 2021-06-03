package ch.juventus.searching;

import ch.juventus.sorting.Person;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();

        map.put(new Person("Hans", "Muster"), "0791234567");
        map.put(new Person("Peter", "Keller"), "0798901234");
        map.put(new Person("Peter", "Kuster"), "0795678901");
        map.put(new Person("Lisa", "Muster"), "0792345678");
    }
}
