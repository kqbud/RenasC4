package PracticeWithClassMate;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class D1Scanner {
    public static void main(String[]aq) {

        Scanner variable = new Scanner(System.in);
        char ch = 'y';
        while (ch=='y'){
            System.out.println("Enter a number");
            int i = variable.nextInt();
            if(i>=1)
                System.out.println(i + " is positive");
            else if(i<0)
                System.out.println(i + " is negative");
            else
                System.out.println(i + " is zero");
            System.out.println("Do you want to continue? y/n");
            ch = variable.next().charAt(0);
        }
        System.out.println("thanks for using");



    }

}
