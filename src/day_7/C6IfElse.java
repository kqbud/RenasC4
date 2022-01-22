package day_7;

public class C6IfElse {
    /*
    Age         Advice
    0-5         Say "Papa" and do not shit in your pants
    6-10        Play
    11-20       Study
    21-60       Work
    +60         Try not to die

     */
    public static void main(String[] args) {
        int age=25;
        if(age<=5)  System.out.println("Say \"Papa\" and do not shit in your pants");
        else if(age<=10) System.out.println("play");
        else if(age<=20) System.out.println("Study");
        else if (age<=60) System.out.println("Work");
        else if(age>60) System.out.println("Try not to die");

    }
}
