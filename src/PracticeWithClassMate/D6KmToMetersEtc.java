package PracticeWithClassMate;

import java.util.Scanner;

public class D6KmToMetersEtc {
    /*
    WAP to enter a distance in Kilometers(km) and print equivalent distance in meters(m), feet(ft), inches(in) and centimeters(cm).
	1 km = 1000 m =>  m = km*1000
	1 m = 3.3 ft  =>  ft= m * 3.3
	1 ft = 12 in  =>  in= ft * 12
	1 m = 100 cm  =>  cm= m * 100

     */
    public static void main(String[] args) {
        Scanner sikem = new Scanner(System.in);
        double km, m, ft, inch, cm;
        System.out.println("Enter a Distance in Kilometers");
        km=sikem.nextDouble();

        m=km*1000;
        System.out.println("in Meters "+ m);

        ft=m*3.3;
        System.out.println("in Feets "+ft);

        inch=ft*12;
        System.out.println("in Inches "+ inch);
        cm=m*100;
        System.out.println("in Centimeters "+ cm);




    }
}
