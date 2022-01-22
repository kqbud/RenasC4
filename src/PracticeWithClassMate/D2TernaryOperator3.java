package PracticeWithClassMate;

import java.util.Scanner;

public class D2TernaryOperator3 {
    public static void main(String[] args) {
        System.out.println("Enter a Integer Value:");
        Scanner variable=new Scanner(System.in);
        int a = variable.nextInt();
        String s;
        /*
        if(a<10)
            s="a is less than 10";
        else{
            if(2000>a) s="2000 is greater than a";
            else s="2000 is less than a";
        }

         */
        s=a<10?"a is less than 10": 2000>a? "2000 is greater than a="+ a :"2000 is less than a="+ a;
        System.out.println(s);

    }
}
