package org.example;

import com.pluralsight.streams.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Person> person = new ArrayList<>();

        person.add(new Person("Emma", "Johnson", 28));
        person.add(new Person("Liam", "Carter", 35));
        person.add(new Person("Olivia", "Bennett", 30));
        person.add(new Person("Noah", "Mitchell", 24));
        person.add(new Person("Ava", "Richardson", 25));
        person.add(new Person("Elijah", "Hayes", 29));
        person.add(new Person("Sophia", "Coleman", 23));
        person.add(new Person("James", "Turner", 27));
        person.add(new Person("Isabella", "Benjamin ", 30));
        person.add(new Person("Benjamin", "Price", 26));


        List<Person> sort = person.stream()
                .sorted(Comparator.comparing(Person::getFirstName))
                .toList();
         sort.forEach(System.out::println);

        //while(true) {
        System.out.print("Enter first or last name: ");
        String name = scanner.nextLine().toLowerCase();

//        boolean found = false;
//        for (Person p : person) {
//
//            if (p.getLastName().trim().equalsIgnoreCase(name) || p.getFirstName().trim().equalsIgnoreCase(name)) {
//                System.out.printf("Firstname: %s    Lastname: %s    Age: %d\n",
//                        p.getFirstName(), p.getLastName(), p.getAge());
//                found = true;
//            }
//        }
//        if (!found) {
//            System.out.println("Not Found");
//        }
//
//       Person temp = null;
//        for(Person pp : person) {
//            if (temp == null || pp.getAge() > temp.getAge()) {
//                temp = pp;
//            }
//        }
//            if (temp !=null) {
//                System.out.println("\nOldest person is:");
//                System.out.printf("Firstname: %s    Lastname: %s    Age: %d\n", temp.getFirstName(), temp.getLastName(), temp.getAge());
//
//        }

    List<Person> filler = person.stream()
            .filter(f -> f.getFirstName().trim().toLowerCase().contains(name) || f.getLastName().trim().toLowerCase().contains(name) ||
                   f.getFirstName().equalsIgnoreCase(name) || f.getLastName().trim().equalsIgnoreCase(name))
            .toList();
    if (filler.isEmpty()) {
        System.out.println("Not found");
     //   break;
    } else {
        filler.forEach(System.out::println);

    }
//}

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        int sum = numbers.stream()
//                .reduce(0,
//                        (temp, num)-> temp += num);

                .mapToInt(Integer::intValue)
                .sum();
               System.out.println(sum);


        Optional<Person> oldest = person.stream()
                .reduce((a,b) -> a.getAge() > b.getAge() ? a : b);

//                oldest.ifPresent(p -> System.out.printf("Firstname: %-10s Lastname: %-10s Age: %d\n",
//                p.getFirstName(), p.getLastName(), p.getAge()));
        System.out.println("\nOldest person is: ");
        System.out.printf("Firstname: %-10s    Lastname: %-10s    Age: %d\n",oldest.get().getFirstName(),oldest.get().getLastName(),oldest.get().getAge());
//        Optional<Integer> oldest = person.stream()
//                .map(Person::getAge)
//                .reduce(Integer::max);
//
//        System.out.println("\nOldest person is: ");
//        oldest.ifPresent(age -> System.out.println("Oldest age: " + age));

    }
}