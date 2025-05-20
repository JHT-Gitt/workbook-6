package org.example;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        List<Person> person = new ArrayList<>();
        person.add(new Person("Dana", "Wyatt", 25));
        person.add(new Person("Zachary", "Westly", 28));
        person.add(new Person("Elisha", "Aslan", 24));
        person.add(new Person("Ian", "Austin", 20));
        person.add(new Person("Zeby", "Hunger", 22));
        person.add(new Person("Erza", "Dragnor", 28));
        person.add(new Person("Erza", "Dragnor", 25));

//        Collections.sort(person, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                int last = o1.getLastName().compareTo(o2.getLastName());
//                return (last != 0) ? last : o1.getFirstName().compareTo(o2.getFirstName());
//            }
//        });

     //   person.sort(Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName)
       //         .thenComparing(Person::getAge));
        Collections.sort(person);

        for(Person p : person){
            System.out.println(p.getFirstName() +" "+ p.getLastName() +" "+ p.getAge());
        }

    }
}