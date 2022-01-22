package day_8;

public class C4Ternary {
    public static void main(String[]can){

        String s ; int a = 10 ;
        /*if(a<10)
            s="a is less than 10";
        else{
            if(2000>a) s="2000 is greater than a";
            else s="2000 is less than a";
        }

         */
         s= (a<10)? " a is less than 10"  : ( (2000 > a) ? " 2000 is greater than a" : "2000 is less than a");
        System.out.println(s);
    }
}
