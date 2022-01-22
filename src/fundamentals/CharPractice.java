package fundamentals;

public class CharPractice {

    public static void main(String[]aq){
        /*
        Java uses UNICODE
        UNICODE is a standard which specifies that there is unique number corresponding
        to each character that we type on the computer
         */

        char symbol1 ='a' ; // a:97
        System.out.println(symbol1);
        char ch = 98 ;
        System.out.println(ch); //b: 98
        ch = 122 ;
        System.out.println(ch) ;

        /*
        Symbols     UNICODE unique numbers OR code points
        0 to 9      48 to 57
        A to Z      65 to 90
        a to z      97 to 122
         */

        //Range of Char
        //0 to 65535
        char ch1 = 48 ;
        //below statement prints the symbol
        // corresponding to number 48
        System.out.println(ch1);
        //6572776984
        char ch2 = 65;
        System.out.print(ch2);
        ch2 = 72 ;
        System.out.print(ch2);
        ch2 = 77;
        System.out.print(ch2);
        ch2 = 69 ;
        System.out.print(ch2);
        ch2 = 84 ;
        System.out.print(ch2);
    }
}
        //ASCII: 256