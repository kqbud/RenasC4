package day_11;

import java.util.Scanner;

public class C2RevisionNestedLoop {
    public static void main(String[] args) {
        /*
        54321
        5432
        543
        54
        5
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");


        int i, j, num = sc.nextInt();

        for(i=num; i>0; i-- ){
            j= i/10;
            i=j;
            if(j==0){
                break;
            }


            System.out.println(j);
        }
    }
}
