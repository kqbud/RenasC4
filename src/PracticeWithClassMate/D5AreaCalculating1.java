package PracticeWithClassMate;

import java.util.Scanner;

public class D5AreaCalculating1 {
    /*
    Write a user driven program(using switch-case) to calculate the areas of the following three shapes.
            -Area of a rectangle is length*breadth. Enter length and breadth of a rectangle and print its area.
            -Area of a square is its side*side (or side^2). Enter the side of a square through user and print its area.
            -Area of a circle is π*r^2 (π*r*r)<==>(3.14*r*r). Where π=3.14 and r is the radius of the circle.
             Enter the radius of a circle through user and print its area.
     */
    public static void main(String[] aq) {
        Scanner scan = new Scanner(System.in);
        char ch='y';
        while(ch=='y') {
            double l, b, p = 3.14, r;
            int option;
            System.out.println("press 1 for rectangle area\npress 2 for square area \npress 3 for circle area");

            option = scan.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter Length");
                    l = scan.nextDouble();
                    System.out.println("Enter Breadth");
                    b = scan.nextDouble();
                    System.out.print("Area of Rectangle:");
                    System.out.println(l * b);
                    break;
                case 2:
                    System.out.println("Enter Length");
                    l = scan.nextDouble();
                    System.out.print("Area of Square");
                    System.out.println(l * l);
                    break;
                case 3:
                    System.out.println("Enter Radius");
                    r = scan.nextDouble();
                    System.out.println("Area of Circle");
                    System.out.println(r * r * p);
                    break;


            }
            System.out.println("Do you wish to continue amk? y/n");
            ch=scan.next().charAt(0);

        }
    }
}