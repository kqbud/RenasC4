package day_21;
import java.util.Scanner;
import java.util.Arrays;
public class C1Revision {
    public static void main(String[]aq){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int arr[]= new int[scan.nextInt()];
        System.out.println("enter the elements of the array");

        for(int i = 0; i<arr.length; i++){
            arr[i]=scan.nextInt();

        }
        System.out.println("Entered array is: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Using for-each loop");
        for(int element : arr)
            System.out.println(element);
    }
}
