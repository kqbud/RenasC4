package day_10;

import java.util.Scanner;

public class C7ScannerDemo {
    public static void main(String[] args) {
        //to take data from the user create a scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        /*
         nextInt() method is used to enter an int number from the user
         */
        int num = sc.nextInt();
        System.out.println("User Entered" + num);
        System.out.println("Program terminated");


    }
}
