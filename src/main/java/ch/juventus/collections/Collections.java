package ch.juventus.collections;

import ch.juventus.object.Person;

import java.util.*;

public class Collections {

    public static void main(String[] args) {
        //arrayList();
        //linkedList();
        //hashSet();
        //linkedHashSet();
        //treeSet();
        //queue();
        //hashMap();
        linkedHashMap();
        treeMap();
    }

    static void arrayList() {


        List<String> tiere = new ArrayList<>();
        tiere.add("Hund");
        tiere.add("Katze");
        tiere.add("Maus");
        tiere.add("Elefant");
        tiere.add("Fledermaus");

        for (int i = 0; i < tiere.size(); i++) {

        }

        System.out.println(tiere.size());

        tiere.add("Vogel");

        System.out.println(tiere);

        if (tiere.contains("Hund")) {
            System.out.println("exists");
        }

        System.out.println(tiere.get(2));

        tiere.remove(1);

        tiere.remove("a");

        System.out.println(tiere);

        tiere.clear();




        // TODO: Erstelle eine ArrayList von Strings und füge 5 Tiere hinzu ("Hund", "Katze", "Maus", ...)
        // TODO: Gib die Anzahl Einträge auf der Konsole aus.
        // TODO: Füge ein weiteres Element mit Index 2 hinzu.
        // TODO: Gib die ganze Liste auf der Konsole aus.
        // TODO: Prüfe ob ein bestimmtes Element in der Liste vorkommt.
        // TODO: Ein Element lesen via Index.
        // TODO: Ein Element löschen via Index
        // TODO: Ein Element löschen via String
        // TODO: Ein Element löschen via Index, das es nicht gibt (was passiert?)
        // TODO: Ein Element löschen via String, das es nicht gibt (was passiert?)
        // TODO: Alle Elemente aus der Liste löschen
    }

    static void linkedList() {

        List<String> tiere = new LinkedList<>();

        tiere.add("Hund");
        tiere.add("Katze");
        tiere.add("Maus");
        tiere.add("Elefant");
        tiere.add("Fledermaus");

        System.out.println(tiere.size());

        System.out.println(tiere.indexOf("Maus"));

        System.out.println(tiere.indexOf("Wal"));

        System.out.println(tiere.get(2));

        System.out.println(((LinkedList)tiere).getFirst());
        System.out.println(((LinkedList)tiere).getLast());

        ((LinkedList)tiere).removeFirst();
        ((LinkedList)tiere).removeLast();


        // TODO: Erstelle eine LinkedList von Strings und füge 5 Tiere hinzu ("Hund", "Katze", "Maus", ...)
        // TODO: Gib die Anzahl Einträge auf der Konsole aus.
        // TODO: Den Index eines bestimmten Elements finden
        // TODO: Den Index eines Elements das nicht existiert finden (was passiert?)
        // TODO: Ein Element via Index lesen
        // TODO: Das erste und letzte Element der Liste ausgeben
        // TODO: Das erste und letzte Element der Liste löschen
    }

    static void hashSet() {

        Set<Person> persons = new HashSet<>();

        persons.add(new Person("Mike", "Jenni"));
        persons.add(new Person("Yanik", "Schupli"));
        persons.add(new Person("Philipp", "Gubser"));
        persons.add(new Person("Philipp", "Gubser"));

        if (persons.isEmpty()) {
            System.out.println("set is empty");
        }
        else {
            System.out.println("Set has entries");
        }

        System.out.println(persons.size());

        System.out.println(persons.contains(new Person("Mike", "Jenni")));

        persons.remove(new Person("Yanik", "Schupli"));

        System.out.println(persons);
        System.out.println(persons);
        System.out.println(persons);
        System.out.println(persons);
        System.out.println(persons);
        System.out.println(persons);

        // TODO: Erstelle ein HashSet von Personen (object package)
        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
        // TODO: Prüfe, ob das Set nicht leer ist
        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        // TODO: Prüfe, ob ein gewisses Element im Set existiert
        // TODO: Lösche ein bestimmtes Element aus dem Set
    }

    static void linkedHashSet() {

        Set<Person> persons = new LinkedHashSet<>();

        persons.add(new Person("Mike", "Jenni"));
        persons.add(new Person("Yanik", "Schupli"));
        persons.add(new Person("Philipp", "Gubser"));
        persons.add(new Person("Philipp", "Gubser"));

        if (persons.isEmpty()) {
            System.out.println("set is empty");
        }
        else {
            System.out.println("Set has entries");
        }

        System.out.println(persons.size());

        System.out.println(persons.contains(new Person("Mike", "Jenni")));

        persons.remove(new Person("Yanik", "Schupli"));

        System.out.println(persons);

        // TODO: Erstelle ein LinkedHashSet von Personen (object package)
        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
        // TODO: Prüfe, ob das Set nicht leer ist
        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        // TODO: Gib das gesamte Set mehrmals auf der Konsole aus. Wie ist die Reihenfolge der Elemente?
    }

    static void treeSet() {
        // TODO: Erstelle ein TreeSet von Personen (object package) und verwende den PersonComperator
        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        // TODO: Gib das gesamte Set auf der Konsole aus. Wie ist die Reihenfolge der Elemente?
    }

    static void queue() {
        // TODO: Erstelle ein Queue von Personen (object package) mit einer LinkedList
        // TODO: Füge mehrere Personen ein
        // TODO: Lies das Head-Element, ohne es zu entfernen
        // TODO: Lies und entferne das Head-Element
    }

    static void hashMap() {

        List<Person> family = new ArrayList<>();
        family.add(new Person("Mike", "Jenni"));
        family.add(new Person("Yanik", "Schupli"));
        family.add(new Person("Philipp", "Gubser"));

        List<Person> friends = new ArrayList<>();
        friends.add(new Person("Hans", "Muster"));
        friends.add(new Person("Mike", "Shiva"));
        friends.add(new Person("Adolf", "Hitler"));

        Map<String, List> persons = new HashMap<>();

        persons.put("family", family);
        persons.put("office", null);
        persons.put("firends", friends);

        System.out.println(persons);

        persons.put("office", friends);

        System.out.println(persons.entrySet());

        System.out.println(persons.keySet());

        System.out.println(persons.values());

        // TODO: Erstelle eine HashMap (Key: String; Value: List<Person>)
        // TODO: Füge folgende Einträge in die Map:
        //  ­ "family" : Liste von 3 Personen
        //  ­ "office" : null
        //  ­ "friends" : Liste von 3 Personen
        // TODO: Gib die gesamte Map auf der Konsole aus
        // TODO: Füge einen weiteren Eintrag "office" : Liste von 2 Personen der Map hinzu.
        //  (Wieviele Einträge sind jetzt in der Map?)
        // TODO: Gib das entrySet auf der Konsole aus
        // TODO: Gib das keySet auf der Konsole aus
        // TODO: Gib die values auf der Konsole aus
    }

    static void linkedHashMap() {
        // TODO: Erstelle eine LinkedHashMap (Key: Integer; Value: Person) mit Access-Order
        // TODO: Fülle 5 Einträge ein (auch doppelte Keys, um zu überprüfen, dass der Value überschrieben wird)
        // TODO: Gib die gesamte Map auf der Konsole aus
        // TODO: Greife auf mehrere Elemente zu
        // TODO: Gib die Map erneut aus und überprüfe die Sortierung
    }

    static void treeMap() {

        Map<Integer, Person> person = new TreeMap<>();

        person.put(0, new Person("Hans", "Muster"));
        person.put(0, new Person("Peter", "Meier"));
        person.put(2, new Person("Philipp", "Zürcher"));
        person.put(3, new Person("Mira", "Berner"));
        person.put(4, new Person("Tom", "Tuner"));

        System.out.println(person);

        // TODO: Erstelle eine TreeMap (Key: Integer; Value: Person)
        // TODO: Fülle 5 Einträge ein (auch doppelte Keys, um zu überprüfen, dass der Value überschrieben wird)
        // TODO: Gib die gesamte Map auf der Konsole aus und überprüfe die Sortierung
    }

}
