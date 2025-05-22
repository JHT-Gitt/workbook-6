package org.example;

import com.pluralsight.streams.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Person> person = new ArrayList<>();

        person.add(new Person("Emma", "Johnson", 28));
        person.add(new Person("Liam ", "Carter", 35));
        person.add(new Person("Olivia ", "Bennett", 30));
        person.add(new Person("Noah ", "Mitchell", 24));
        person.add(new Person("Ava ", "Richardson", 25));
        person.add(new Person("Elijah ", "Hayes", 29));
        person.add(new Person("Sophia ", "Coleman", 23));
        person.add(new Person("James", "Turner", 27));
        person.add(new Person("Isabella ", "Benjamin ", 30));
        person.add(new Person("Benjamin ", "Price", 26));

        System.out.print("Enter first or last name: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (Person p : person) {
            if (p.getLastName().trim().equalsIgnoreCase(name) || p.getFirstName().trim().equalsIgnoreCase(name)) {
                System.out.printf("Firstname: %s    Lastname: %s    Age: %d%n",
                        p.getFirstName(), p.getLastName(), p.getAge());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }

    }
}