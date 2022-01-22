package day_14;

import java.util.Scanner;

public class C1Revision{
    public static void main(String[] args) {
        //Scanner: a referenced data type as it is a class
        //scan: a reference variable
        Scanner scan = new Scanner(System.in);
        //using the object reference of the Scanner class,
        //in built methods of Scanner class can be called
        /*
        System.out.println("Enter a number");
        if(scan.hasNextInt()) {
            int value = scan.nextInt();
            System.out.println("valid int entered: " + value);
        }
        else{
            System.out.println("No. entered is not a valid int");

         */
        while(!scan.hasNextInt()){
            System.out.println("Please enter a valid int number");
            scan.nextLine();
        }
        // after making sure that the valid int number is entered,
        // that number is scanned by the nextInt method
        int value = scan.nextInt();

        System.out.println("Entered int value is: " + value);
    }

}
