package day_6;

public class C9IfElseHOCA {

    public static void main(String[]ap){

        int i =1, j=10;

        if(i==j)
            i = i + j;
        else
            i = ++i + j;

        System.out.println(i+"\n"+j);

    }
}
