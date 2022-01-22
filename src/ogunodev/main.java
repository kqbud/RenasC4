package ogunodev;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the amount of purchase");

        PreferredCustomer p1 = new PreferredCustomer("recep tayyip erdogan","cankaya", 000000001
                ,3643523, true,scan.nextDouble());
        System.out.println(p1.toString());
        //System.out.println("total including discount: "+p1.total());
    }
}
