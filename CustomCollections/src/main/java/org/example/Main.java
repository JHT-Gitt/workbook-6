package org.example;

import com.pluralsight.collection.FixedList;

public class Main {
    public static void main(String[] args) {

        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43); // this line should fail
        System.out.println(numbers.getItems().size());

    }
}