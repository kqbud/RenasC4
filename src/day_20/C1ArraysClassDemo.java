package day_20;

import java.util.Arrays;

public class C1ArraysClassDemo {
    public static void main(String[]saas){
        int [] numbers = {1,9,7,3};
        String [] names={"ridvan","Bahast","Musab"};
        char[] letters={'w','b','x','d','e'};



        Arrays.sort(numbers);
        Arrays.sort(names);
        Arrays.sort(letters);
        
        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i] + "\t");
        }

        System.out.println("\nUsing Arrays.sort method.");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(letters));

        System.out.println( concatenation("hello","world") );
        System.out.println( concatenation("hello","Java","world","selam") );
    }
    //Return type has no role in method overloading
    public static String concatenation(String str1, String str2){
        return str1.concat(" " + str2);
    }

    public static String concatenation(String str1, String str2, String str3, String str4){
        return str1.concat(" " + str2).concat(" " + str3).concat(" " + str4);
    }
}
