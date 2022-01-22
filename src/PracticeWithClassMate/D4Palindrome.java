package PracticeWithClassMate;

import java.util.Scanner;

public class D4Palindrome {
    public static void main(String[] args) {
        int num, copy, reverse = 0, last_digit;

        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        copy = num;
        while (num > 0) {
            last_digit=num%10;
            reverse=(reverse*10)+last_digit;
            num=num/10;
        }
        if(reverse==copy){
            System.out.println("palindrome bu amk");

        }
        else System.out.println("verecegin numarayi sikim");
    }
}