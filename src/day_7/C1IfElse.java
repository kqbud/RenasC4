package day_7;

public class C1IfElse {
    public static void main(String[]aq){
        /*
        WAP to print the greater of the two given numbers
        WAP to print the smaller of the two given numbers
        WAP to print the greatest of the three given numbers
        WAP to print smallest of the three given numbers
         */

        int a=33, b=94, c=72;
        if(a<b && a<c) System.out.println(a + " is the smalest");
        else if(b<a && b<c) System.out.println(b + " is the smalest");
        else if (c<a && c<b) System.out.println(c + " is the smalest");


        if (c>a && c>b) System.out.println(c);
        else if (a>c && a > b) System.out.println(a);
        else System.out.println(b);


    }
}
