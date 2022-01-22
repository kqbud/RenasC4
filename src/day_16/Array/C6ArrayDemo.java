package day_16.Array;

import java.util.Scanner;

public class C6ArrayDemo {
    /*
    WAP TO enter the size of a double array
    then input the values of the array and
    find the sum and average of all the values.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the array size");
        int a;
        double sum;
        sum=0;
        a = scan.nextInt();
        double arr[] = new double[a];
        System.out.println("enter the values");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"]= ");
            arr[i] = scan.nextDouble();

        }
        System.out.println("entered values are: ");
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        double average;
        average=sum/arr.length;
        System.out.println("sum: " + sum);
        System.out.println("average: " + average);
    }
}