package PracticeWithClassMate;

import sun.java2d.loops.GeneralRenderer;

import java.util.Scanner;

public class D6MarksCalculation {
    /*
    WAP to input the makrs of following five subjects from the user and print the Percentage and result based on that percentage.
    Georgian, English, Maths, Science, Computers. Marks should be out of 100.
    Percentage=(Marks of all 5 subjects/500)*100.
	Percentage 		Result
	<40			FAIL
	>=40 and <50		THIRD
	>=50 and <60		SECOND
	>=60 and <75		FIRST
	>75			FIRST WITH DISTINCTION
     */
    public static void main(String[] args) {
        Scanner sikim = new Scanner(System.in);
        int Georgian, English, Maths, Science, Computers;

        System.out.println("Enter Georgian marks: ");
        Georgian=sikim.nextInt();

        System.out.println("Enter English marks: ");
        English=sikim.nextInt();

        System.out.println("Enter Maths marks: ");
        Maths=sikim.nextInt();

        System.out.println("Enter Science marks: ");
        Science=sikim.nextInt();

        System.out.println("Enter Computers marks: ");
        Computers=sikim.nextInt();

        double percentage;

        percentage= (Georgian+English+Maths+Science+Computers)/5;

                if(percentage<40){
                    System.out.println("Fails");
                }
                else if(percentage<50) {
                    System.out.println("Third");
                }
                else if (percentage<60){
                        System.out.println("Second");
                    }
                else if(percentage<75){
                    System.out.println("First");
                }
                else{
                    System.out.println("First with Distinction");
                }
    }
}
