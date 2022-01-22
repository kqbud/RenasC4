package asignments;

public class Java2 {
    public static void main(String[]aq){
        System.out.println("1.)  Write a Java program to print the result of the following operations.\n" +
                "     Test Data:\n" +
                "     a. -5 + 8 * 6\n" +
                "     b. (55+9) % 9\n" +
                "     c. 20 + -3*5 / 8\n" +
                "     d. 5 + 15 / 3 * 2 - 8 % 3") ;
        System.out.println("1.)  Expected Output:");

        int a = -5 ;
        int b = 8 ;
        int c = 6 ;
        System.out.println(("a.\t") + (a + b * c)) ;

        a = 55 ;
        b = 9 ;
        c = 9 ;
        System.out.println(("b.\t") + ((a + b) % c));

        a = 20 ;
        b = -3 ;
        c = 8 ;
        int d = 5 ;
        System.out.println(("c.\t") + (a + b * d / c)) ;

        System.out.println(("d.\t") + (5 + 15 / 3 * 2 - 8 % 3)) ;



    }
}
