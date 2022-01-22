package MyOwnCuteTryOuts;

import java.util.Scanner;

public class SmallTaskDec16 {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers:");
        Scanner num1 = new Scanner(System.in);
        double d = num1.nextDouble();
        Scanner num2 = new Scanner(System.in);
        double d2 = num2.nextDouble();
        double add= (d + d2);
        double sub = d-d2;
        double mul = d*d2;
        double div = d/d2;
        double mod = d%d2;
        System.out.print(add + "\n" + sub+ "\n" +mul+ "\n" +div+ "\n" +mod );


    }
}
