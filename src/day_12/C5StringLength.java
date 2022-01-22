package day_12;

import java.util.Scanner;

public class C5StringLength {
    public static class StringLength {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Please write a name ");
            String name = scan.nextLine();

            for (int j = 0; j<=name.length()-1; j++) {
                System.out.println(name.charAt(j));


            }
            System.out.println(name.length());
        }
    }
}

