package day_6;

public class C4ScopeofVariables{

    public static void main(String[]aq){
        System.out.println("This is before the block of code");

        {
            System.out.println("This is inside a block of code");
            int i = 10;
            System.out.println(i);//10
        }
        int i = 20;
        System.out.println(i);//20
        if('a'!='b')
            System.out.println("This is after the block of code");
    }
}
