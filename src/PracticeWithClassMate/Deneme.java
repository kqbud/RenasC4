package PracticeWithClassMate;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        /*
        String s = "Hello"+100;
        System.out.println(s);
        char show = 65;
        System.out.println(show);

        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        a=scan.nextInt();
        b=scan.nextInt();
        System.out.println(a+b);

         */

        int arr[][] = {{10, 20, 30, 5}, {31, 31, 31},{55,23,54}};

        printArray(arr);

        int arr2[] = {3, 9, 8};
        System.out.println("\nSecond Array");
        printArray(arr2);
        int arr3[] = {31, 31, 31};
        System.out.println("third array");
        printArray(arr3);
    }

    //printArray method takes int type array as argument
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");


            }
            System.out.println();
        }
    }
    static void printArray( int[]arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);


        }
    }
}

