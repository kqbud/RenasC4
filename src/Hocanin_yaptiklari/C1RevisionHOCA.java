package day_6;

public class C1RevisionHOCA {

    public static void main(String[]ap){

        int i = 1;
        //
        int r = ++i + i-- - i++ + --i ;
        System.out.println(r);//4
        System.out.println(i);//1

        /* int r = --i + i++ + i++ - i-- - ++i;
        System.out.println(r);//-3
        System.out.println(i);//2*/


    }
}
