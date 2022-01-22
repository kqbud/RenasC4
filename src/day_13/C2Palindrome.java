package day_13;

import java.util.Scanner;

public class C2Palindrome {
    public static void main(String[] args) {
        /*
        num:holds the original number
        copy:holds the copy of the or. number
        reverse: holds the reversed number
         */
        int num,reverse=0,copy,last_digit;
        System.out.println("Enter any number");                    //num=123,copy=123, last digit=3, reverse=3
        Scanner sc = new Scanner(System.in);                       //num=12, last digit=2, reverse=32
                                                                   //num=1, last digit=1, reverse=321
        num=sc.nextInt();

        copy=num;

        while(num>0){
            System.out.println("AN ITERATION");
            last_digit=num%10;
            System.out.println("last_digit: "+last_digit);
            reverse=(reverse*10)+last_digit;
            System.out.println("reverse: "+ reverse);

            num=num/10;
            System.out.println("num: "+num+"\n");
        }
        if(copy==reverse)
            System.out.println("Palindrome Number");
        else System.out.println("not a palindrome number");


    }
}
