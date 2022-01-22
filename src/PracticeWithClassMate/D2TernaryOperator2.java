package PracticeWithClassMate;

import java.util.Scanner;

public class D2TernaryOperator2 {
    public static void main(String[]oc){

        /*
        variable = (boolean expression) ? value to assign if true : value to assign if false ;

           variable= expression1 ? expression2 : expression3 ;
        */

        System.out.println("Enter an Integer Value:");
        Scanner variable= new Scanner(System.in);
        int a = variable.nextInt();
        /*String s;
    if(a<10) s="a is less than10";
    else s="a is not less than 10";*/
        String s = (a<10)?"a is less than 10":"a is not less than 10";
        System.out.println(s);
    }
}
