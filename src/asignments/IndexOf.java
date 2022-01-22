package asignments;

import java.util.Scanner;

public class IndexOf {
    /*
        WAP to enter a string and then ask the user the
        enter a character to find its index in the
        entered string and print the index
        OUT
        -----
        Enter a string
        Hello Bello
        Enter a character to find index for:
        e
        Index of 'e' is 1.
         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s;
        s = scan.nextLine();
        System.out.println("Enter a character to find index for:");
        char ch = scan.next().charAt(0);

        if(s.indexOf(ch) == -1)
        System.out.println("character '" + ch + "' is not there!");
        else
        System.out.println("Index of '" + ch+ "' is " + s.indexOf(ch));
    }
}
