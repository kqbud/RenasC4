package HackerRank;
import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            int x;
            int d;
            int a;

            String s1 = sc.next();
            String mahmut = String.format("%-16s", s1);
            x = sc.nextInt();
            String ax = String.format("%03d" , x);

            String s2 = sc.next();
            String pads2 = String.format("%-16s", s2);
            d = sc.nextInt();
            String ad = String.format("%03d" , d);

            String s3 = sc.next();
            String pads3 = String.format("%-16s", s3);
            a = sc.nextInt();
            String bd = String.format("%03d" , a);


            System.out.println("================================");

            System.out.println(mahmut + ax);

            System.out.println(pads2 + ad);

            System.out.println(pads3 + bd);

            System.out.println("================================");



    }
}