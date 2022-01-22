package PracticeWithClassMate;

import java.util.Scanner;

public class D6PrintReverse {
    /*
    WAP to enter a number and print its reverse.
     */
    public static void main(String[] args) {
        Scanner sikimoc = new Scanner(System.in);
        System.out.println("Enter a number");

        int original, copy, reverse, last_digit;
        reverse = 0;
        original=sikimoc.nextInt();
        copy=original;
        while(original>0){
            last_digit=original%10;
            reverse=(reverse*10) + last_digit;
            original=original/10;

        }
        System.out.println("deneme");
            System.out.println(reverse);



    }
}
