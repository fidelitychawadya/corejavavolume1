package com.fide.chapter4;

import java.time.*;

public class CalendarTest {
    public static void main(String[] args){
        //create a LocalDate object and assign it to date
       LocalDate date = LocalDate.now();

       //capture the current month and day
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today -1);// set to start of month
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();// 1= Monday, 2=Tuesday...7= Sunday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i=0; i< value; i++)
            System.out.println("   ");

        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
        if(date.getDayOfWeek().getValue() != 1)
            System.out.println();

    }
}
