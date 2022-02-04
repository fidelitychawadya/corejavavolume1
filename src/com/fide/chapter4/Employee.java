package com.fide.chapter4;

import java.time.LocalDate;
import java.util.Random;

public class Employee {
    private String name = "";
    private double salary;
    private LocalDate hireDay;
    private static int nextId = 1;
    private int id;

    //static initialization block
    static{
        var generator = new Random();
        //set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10_000);
    }

    //object initialization block
    {
      id = nextId;
      nextId++;
    }

    public Employee() {

    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        id = 0;
    }

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    //unit test on Employeee object
    public static void main(String[] args){
        var e = new Employee("Harry", 50_000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
