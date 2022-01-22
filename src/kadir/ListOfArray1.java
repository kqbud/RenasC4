package kadir;

import java.util.ArrayList;
import java.util.Scanner;

public class ListOfArray1 {
    public static void main(String[] args) {
        Scanner ka = new Scanner(System.in);
        ArrayList<String> fruits = new ArrayList<>();
        System.out.println("Enter 3 fruits name ");
        fruits.add(ka.next());
        fruits.add(ka.next());
        fruits.add(ka.next());
        System.out.print("The size of Fruits is " + fruits.size());
        System.out.println("\n" + fruits);
        System.out.println("\nadd fruit to index 0");
        fruits.add(0, ka.next());
        System.out.println(fruits);
        System.out.println();
        System.out.println(fruits.get(0));
        System.out.println(fruits.get(1));
        System.out.println(fruits.get(2));
        fruits.set(0, "pineapple");
        System.out.println(fruits);
        fruits.remove(3);
        System.out.println(fruits);
        fruits.remove("apple");
        System.out.println(fruits);
        System.out.println();
        fruits.clear();
        System.out.println(fruits);
        fruits.size();
        System.out.println(fruits);
        fruits.add("blueberry");
        System.out.println(fruits.size());

    }
}