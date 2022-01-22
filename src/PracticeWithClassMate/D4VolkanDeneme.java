package PracticeWithClassMate;

import java.util.Scanner;

public class D4VolkanDeneme {
    public static void main(String[]protaste){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Full Name");

        String j=scan.nextLine();

        System.out.println("Full name:" +j);

        for (int i= j.length()-1; i>=0; i--){

            System.out.print(j.charAt(i));

        }
        System.out.println();

        System.out.println(j.length());
    }
}
