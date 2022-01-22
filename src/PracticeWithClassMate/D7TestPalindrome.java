package PracticeWithClassMate;
import java.util.Scanner;
public class D7TestPalindrome {
    public static void main(String[]sss) {
        Scanner scan = new Scanner(System.in);


        char yenile='y';

        while (yenile == 'y') {
            System.out.println("Enter a number");
            int original;
            int copy;
            int reverse;
            int last_digit;
            reverse = 0;
            original = scan.nextInt();
            copy = original;
            while (original > 0) {
                System.out.println("Dusunuyorum Oyleyse Varim");

                last_digit = original % 10;
                System.out.println("Last Digit: " + last_digit);

                reverse = (reverse * 10) + last_digit;
                System.out.println("Reverse: "+ reverse);

                original = original / 10;
                System.out.println("Cakma ama birebir ayni: "+original );
            }
            if (copy == reverse) {
                System.out.println("Bravo ");
            } else {
                System.out.println("verecegin numarayi seviyim");
            }
            System.out.println("Tekrar etmek icin y'ye bas yoksa baska bisiye bas");
            yenile=scan.next().charAt(0);


        }

        System.out.println("iyi hadi bye");

    }


}

