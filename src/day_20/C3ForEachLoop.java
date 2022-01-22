package day_20;
import java.util.Scanner;
import java.util.Arrays;
public class C3ForEachLoop {
    //For-each loop OR Enhanced for loop
    public static void main(String[] args) {
        //loop types
        //for loop
        //while loop
        //do while loop
        // for each loop

        int [] numbers = {1,2,3,4,5};

        for(int eachNumber : numbers){
            //for each loop will store each element from the numbers list in each iteration
            //from the first one to last one

            System.out.print(eachNumber+"\t");
        }
        System.out.println();
        String [] names = { "Yad" , "Mesut" , "Özgür"};

        for( String name:names) {
            System.out.print(name +" ");
        }
        System.out.println();

        String sentence="Hello lovely-Java-people!";
        //split method to store everything in the array
        String [] words = sentence.split("-");
        System.out.println("Using for-each loop");
        for(String word:words){
            System.out.println(word);
        }
        // for each loop doesnt need to have starting and ending point
        // it will check everything you have in the list, array

        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
        int [] numberList={1,2,5,20,4,-8,9,100};
        for( int number: numberList){ // 0... last-index
            System.out.print("hello");
            System.out.println(number);
        }
    }


}
