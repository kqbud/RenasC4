package day_12;

import java.util.Scanner;

public class C6WhileDemo {
    public static void main(String[] args) {
        /*
        WAP to check of the entered number is positive, negative or zero(HINT: Use Scanner)
        Ask the user if he wants to continue or stop(HINT: Use do-while or a while loop)
         */
        Scanner scan = new Scanner(System.in);
        char ch = 'y';
        while (ch == 'y') {

            System.out.println("Enter a number");
            int i = scan.nextInt();
            if (i >= 1) System.out.println(i + " is positive");
            else if (i == 0) System.out.println(i + " is zero");
            else System.out.println(i + " is negative");
            System.out.println("Do you want to continue? y/n");
            ch = scan.next().charAt(0);

        }
        System.out.println("thanks for using");
    }
}
