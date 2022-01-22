package day_19;
import java.util.Scanner;
public class C8Methods {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter 2 numbers1");

        System.out.println( add(scan.nextInt(), scan.nextInt() )) ;
    }

    static int add(int a, int b){return a+b;}
}
