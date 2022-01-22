package MyOwnCuteTryOuts;

import java.util.Scanner;

public class kefoarray {

        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Please enter some digits");
            int num[]= new int[5];
            for(int i=0; i<num.length; i++){
                num[i] = scan.nextInt();

            }
            System.out.println("\nEntered num are:");
            for(int i=0; i<num.length; i++)
                System.out.println(num[i]);

        }
    }

