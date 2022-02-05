package com.fide.chapter5;


import com.fide.chapter4.Employee;

import java.util.ArrayList;

/**
 * This program demonstrates the ArrayList class
 */
public class ArrayListTest {
    public static void main(String[] args) {
        //fill the staff array list with three Employee objects
        var staff = new ArrayList<Employee>();


        //add staff using x.add() method
        staff.add(new Employee("carl cracker", 75_000, 1987, 12, 15));
        staff.add(new Employee("Harry hacker", 50_000, 1987, 12, 15));
        staff.add(new Employee("Tony Tester", 40_000, 1987, 12, 15));

        //rasie everuone's salary by 5%
        for (Employee e : staff)
            e.raiseSalary(5);

        //print out information about all Employee objects
        for (Employee e : staff)
            System.out.println("name = " + e.getName() + ", salary = "
                    + e.getSalary() + ", hire day = " + e.getHireDay());
    }
}
