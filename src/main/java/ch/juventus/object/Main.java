package ch.juventus.object;

public class Main {

    public static void main(String[] args) {
        Address address1 = new Address("Seestrasse", 1, 8000, "Zürich");
        Address address2 = new Address("Bahnhofstrasse", 5, 8100, "Zürich");
        Person person1 = new Person("Eva", "Meier", address1, 25, false);
        Person person2 = new Person("Eva", "Meier", address2, 25, false);

        System.out.println(person1);

        System.out.println(person1.equals(person2));
    }
}