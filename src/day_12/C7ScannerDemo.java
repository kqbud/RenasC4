package day_12;

import java.util.Scanner;

public class C7ScannerDemo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a integer");
        int i;
        boolean flag = true;
        while(flag) {
            if (scan.hasNextInt()) {
                i = scan.nextInt();
                System.out.println("Entered number is " + i);
                flag=true;
                break;

            }

        }
        System.out.println("Invalid Entry! Please try again!!");
    }
}
