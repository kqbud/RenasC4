package PracticeWithClassMate;

import java.util.Scanner;

public class MethodCalculator {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter 2 numbers");


        System.out.println("Enter 2 numbers for Addition");
        System.out.println(add(scan.nextInt(), scan.nextInt() ));

        System.out.println(sub(scan.nextInt(), scan.nextInt() ));

        System.out.println(mul(scan.nextInt(), scan.nextInt() ));

        System.out.println(div(scan.nextInt(), scan.nextInt() ));

        System.out.println(mod(scan.nextInt(), scan.nextInt() ));
    }

    static int add(int a, int b){
        return a+b;
    }

    static int sub(int a, int b){ return a-b; }

    static int mul(int a, int b){return a*b;}

    static int div(int a, int b){return a/b;}

    static int mod(int a, int b){return a%b;}


}



