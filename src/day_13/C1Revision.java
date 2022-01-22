package day_13;

import java.util.Scanner;

public class C1Revision {
    /*
    WAP to enter marks in 5 subjects out of 100. If marks in any subject is less than 33 then it's a failure.
    Your program should output the no. of subjects the person is failing in else it should print PASS.
	50
	60
	98
	58
	81 (edited)
     */
    public static void main(String[]aq){
        char option;
        do {
            double english, maths, science, history, computers;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter marks out of 100 for the following subjects");
            System.out.println("English");
            english = scan.nextDouble();
            System.out.println("maths");
            maths = scan.nextDouble();
            System.out.println("Science");
            science = scan.nextInt();
            System.out.println("History");
            history = scan.nextDouble();
            System.out.println("Computers");
            computers = scan.nextDouble();

            byte count = 0;
            if (english < 33) count++;
            if (maths < 33) count++;
            if (science < 33) count++;
            if (history < 33) count++;
            if (computers < 33) count++;

            if (count > 1) {
                System.out.println("The student is failing in " + count + " subjects");
            } else System.out.println("PASS");
            System.out.println("Press y to continue or any other key to stop!!");
            option= scan.next().charAt(0);
        }while(option=='y' || option=='Y');




    }
}
