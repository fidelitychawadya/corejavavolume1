package com.fide.chapter4;

/**
 * This program demonstrates parameter passing in Java
 */
public class ParamTest {
    public static void main(String[] args){
        /*
        *Test 1 Methods cant modify numeric parameter
         */

        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After percent=" + percent);

        /*
        * Test 2 Methods can change the state f object parameters
         */

        System.out.println("\n Testing tripleSalary:");
        var harry = new Employee("Harry", 50_000);
        System.out.println("Before: salry=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salart=" + harry.getSalary());
    }

    public static void tripleValue(double x) {
        x= 3 * x;
        System.out.println("End of method: x = " + x); /// does work because its method parameter
    }

    public static void tripleSalary(Employee x){
        x.raiseSalary(200);
        System.out.println("End of method: salary=" + x.getSalary());

    }


}
