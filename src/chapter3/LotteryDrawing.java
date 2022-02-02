package chapter3;

import java.util.*;

/**
 * This program demonstrates array manipulation
 * Taken from core java volume 1
 * @version 1.20 2022-02-02
 * @author Fidelity Chawadya
 */

public class LotteryDrawing {
    public static void main(String[] args) {
        //take an input from the cmd
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw?");
        int k = in.nextInt();

        System.out.println("What is the highest number you can draw?");
        int n = in.nextInt();

        //fill an array with numbers 1 2 3 ...n
        int[] numbers = new int[n];

        for(int i=0; i< numbers.length; i++)
            numbers[i] = i+1;

        //draw k numbers and put them ito a second array
        int[] result = new int[k];
        for (int i=0; i< result.length; i++){
            //make a random index between 0 and n-1
            int r = (int)Math.random() * n;
            //pick the element at the random location
            result[i] = numbers[r];

            //move the last elemnt into the random location
            numbers[r] = numbers[n - 1];
            n--;
        }

        //print the sorted array
        Arrays.sort(result);
        System.out.println("Bet the following combination.");
        for (int r: result)
            System.out.println(r);


    }
}
