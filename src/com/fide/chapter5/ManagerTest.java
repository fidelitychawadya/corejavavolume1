package com.fide.chapter5;

import com.fide.chapter4.Employee;

/**
 * This program demonstrates inheritance
 */
public class ManagerTest {
    public static void main(String[] args){
        //construct a Manager object
        var boss = new Manager("Carl Cracker", 80_000, 1987, 12, 15);
        boss.setBonus(5000);

        var staff = new Employee[3];

        //fill the staff array with Manager and Employee objects
        staff[0] = boss;
        staff[1] = new Employee("Harry haker", 50_000, 1989, 10, 1);
        staff[1] = new Employee("Tommy Tester", 40_000, 1990, 3, 15);

        //print out information about all Employee objects
        for(Employee e: staff)
            System.out.println("name=" + e.getName() + ", salary=" +e.getSalary());
    }
}
