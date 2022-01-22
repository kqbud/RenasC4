package PracticeWithClassMate;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class D2TernaryOperator1 {
    public static void main(String[] args) {
        //ternary operator is like a shorthand of if else block
        Scanner variable = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = variable.nextInt(), j;

        /*
        if(i<9)
        j=1;
        else
        j=;
         */
        j=i<9?1:0;
        System.out.println("i= " + i);
        System.out.println("j= "+ j);

    }




}
