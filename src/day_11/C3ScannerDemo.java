package day_11;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C3ScannerDemo{
    public static void main(String[] args) {
        Scanner car = new Scanner(System.in);
            System.out.print("Enter a int number:");
            int i  = car.nextByte();
            System.out.println(i);

            System.out.println("Enter a byte number:");
            byte b =  car.nextByte();
            System.out.println("Entered byte number is" + b );
            System.out.println("Enter a short number:");
            short s = car.nextShort();
        System.out.println("your short number:" + s);

            System.out.println("Enter a long number:");
            long l = car.nextLong();
        System.out.println("haha Long number is:" + l);


        System.out.println("Enter float and double numbers" );
        float f = car.nextFloat();
        double d = car.nextDouble();
        System.out.println(f+"\n"+d);

    }
}
