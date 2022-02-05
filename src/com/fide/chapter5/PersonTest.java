package com.fide.chapter5;

import com.fide.chapter4.Employee;

/**
 * This program demonstrates abstract classes
 */
public class PersonTest {

    public static void main(String[] args){

        var people = new Person[2];

        //fill the people array with Student and Employee objects
        people[0] = new Employee("Harry Hacker", 50_000, 1989, 10, 1);
        people[1] = new Student("James Morris", "computer science");


        //print out the names and descirptions of all Person Objects
        for(Person p : people)
            System.out.println(p.getName() + ", " + p.getDescription());
    }
}
