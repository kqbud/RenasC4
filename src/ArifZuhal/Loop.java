package ArifZuhal;
import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scn.nextInt();
        //inner loop prints the rows and outer loop prints the columns
        for (int i = 0; i <= (n - 1); i++) {
            for (int j = 0; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ( i + 1); k++) {
                System.out.print(" * ");
            }
            System.out.println("\t");
        }
    }
}