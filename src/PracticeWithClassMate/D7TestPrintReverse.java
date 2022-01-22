package PracticeWithClassMate;
import java.util.Scanner;
public class D7TestPrintReverse {
    public static void main(String[]orospusara){
        Scanner scan = new Scanner(System.in);
        int original;
        int reverse;
        int last_digit;
        reverse=0;
        System.out.println("Enter a number");
        original=scan.nextInt();

        while(original>0){
            System.out.println("ITERATION");
            last_digit=original%10;
            reverse=(reverse*10)+last_digit;
            original=original/10;
            System.out.println("Reverse: "+ reverse);

        }
    }
}
