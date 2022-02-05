package com.fide.chapter5;

import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.print("Enter a size: (SMALL. MEDIUM, LARGE, EXTRA LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size = " + size);
        System.out.println("abbreviation= " + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE) {
            System.out.println("Good job");
        }
    }


}

enum Size{
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }
    public String getAbbreviation() {
        return abbreviation;
    }

    private String abbreviation;
}

//static Enum valueOf(Class enumClass, String name )
//returns the enumerated constant of the given class name

//
