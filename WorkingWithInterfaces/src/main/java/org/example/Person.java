package org.example;

public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        int last = this.lastName.compareTo(other.lastName);
        if (last != 0) {
            return last;
        }
        int first = this.firstName.compareTo(other.firstName);
        if (first != 0) {
            return first;
        }
        return Integer.compare(this.age, other.age);
    }
}
