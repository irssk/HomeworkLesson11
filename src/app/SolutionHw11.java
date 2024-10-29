package app;

import app.models.Person;

public class SolutionHw11 {
    public static void main(String[] args) {
        Person john = new Person("John", "Інженер", 30);
        Person mary = new Person("Mary", "Вчитель", 25);
        Person bob = new Person("Bob", "Лікар", 35);

        System.out.println("1. " + john);
        System.out.println("   " + mary);
        System.out.println("   " + bob);

        Person alice = new Person("Alice", "Архітектор", 28);
        System.out.println("\n2. " + alice);

        alice.setProfession("Дизайнер");
        System.out.println("   (Після оновлення професії)");
        System.out.println("   " + alice);
    }
}