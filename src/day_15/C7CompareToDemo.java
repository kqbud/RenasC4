package day_15;

import java.util.Scanner;

public class C7CompareToDemo {
    public static void main(String[] args) {
        Scanner siken = new Scanner(System.in);
        String s;
        String s1;
        s = siken.next();
        s1= siken.next();

        /*
        the compareTo() method compares two strings lexicographically (in the dictionary order)
        the comparison based on the Unicode value of each character in the strings.
        If the characters of the shorter string are same as those corresponding to the longer string,
        difference in the number of characters is returned
         */
        System.out.println(s.compareTo(s1));

        /*
        compareTo returns
        1) +ve number: this string comes after the specified string
                        is greater than the specified string
        2)-ve number: this string comes before the specified string
                        is smaller than the specified string
        3)0         : this string is equal to the specified string
         */
    }
}
