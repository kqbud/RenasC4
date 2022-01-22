package PracticeWithClassMate;

import java.util.Scanner;

public class D1SumOfDigits {
    public static void main(String[]rey){
        System.out.println("Enter a Number");
        Scanner variable = new Scanner(System.in);
        int n = variable.nextInt();
        int hane5 = n/10000;
        int hane1 = (n/1000)%10;
        int hane2 = (n/100)%10;
        int hane3 = (n/10)%10;
        int hane4 = n%10;
        System.out.println(hane5+"\n"+hane1+ "\n" + hane2 + "\n" + hane3 + "\n" + hane4);
        int sum_of_digits = hane5 + hane1  + hane2 + hane3 + hane4;

        System.out.println(sum_of_digits);
        System.out.println("Thank you for Entering number amina kodugum");
    }

}
