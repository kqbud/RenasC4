package kadir;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class ListOfArray2 {
    public static void main(String[] args) {
        Scanner ka = new Scanner(System.in);
        /*
        ArrayList<String> fruits = new ArrayList<>();
        System.out.println("Enter 3 fruits name ");
        fruits.add(ka.next());
        fruits.add(ka.next());
        fruits.add(ka.next());
        fruits.add(ka.next());
        for(int i = 0; i<fruits.size(); i++) {
            System.out.println(fruits.get(i) + "");
        }
        System.out.println(fruits);
        Collections.sort(fruits);
        System.out.println(fruits)
         */
        ArrayList<Integer> num=new ArrayList<>();
        System.out.println("Enter 5 numbers to find Max and Min");
        num.add(ka.nextInt());
        num.add(ka.nextInt());
        num.add(ka.nextInt());
        num.add(ka.nextInt());
        num.add(ka.nextInt());
        for(int i=0; i<num.size(); i++){
            Collections.sort(num);
            System.out.println(num.get(i) + " ");
        }
        System.out.println("Min num is "+num.get(0));
        System.out.println("Max num is "+ num.get(4));
    }
}