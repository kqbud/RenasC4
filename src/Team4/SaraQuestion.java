package Team4;

import java.util.Scanner;

public class SaraQuestion {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int s;
        System.out.println("Please enter numbers");
        s=scan.nextInt();
        int arr[]=new int[s];
        int largest = Integer.MAX_VALUE;
        int smallest = Integer.MIN_VALUE;


        for(int i = 0; i<s; i++){
            int current=scan.nextInt();
            if(current>largest){
                largest=current;
            }
            if(current<smallest){
                smallest=current;
            }

        }

        }
    }