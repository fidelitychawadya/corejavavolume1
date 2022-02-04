package com.fide.chapter4;

public class EmployeeTest {
    public static void main(String[] args)  {

        //create the staff array with 3 Employee Objests
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 1);
        staff[1] = new Employee("Harry Hacker", 55000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        //raise everyone's salry by 5%
        for (Employee e: staff)
            e.raiseSalary(5);

        //print out information about all Employee objects
        for (Employee e: staff)
            System.out.println("name = " + e.getName() +
                    ",salary = " + e.getSalary() +
                    e.getHireDay());
    }
}
