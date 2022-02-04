package com.fide.chapter4;

public class StaticTest {

    public static void main(String[] args) {
        //fill the staff arry with 3 Employee objest
        var staff = new Employee[3];
        staff[0] = new Employee("Tom", 40_00);
        staff[1] = new Employee("Dick", 50_00);
        staff[2] = new Employee("Harry", 60_00);

        for (Employee e : staff) {
            e.setId();
            System.out.println("name= " + e.getName() + ", id = "
                    + e.getId() + ", salary = " + e.getSalary());

        }
    }

}


