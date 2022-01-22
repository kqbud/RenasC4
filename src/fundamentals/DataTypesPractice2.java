package fundamentals;

public class DataTypesPractice2 {
    public static void main(String[]lol) {
        /*
                PRIMITIVE DATA TYPES IN JAVA
                Types       Size(s)
                -----       -------
                byte        1 byte  8 bits      -128 to 127
                short       2 bytes 16 bits    -32,768 to 32,767
                int         4 bytes 32 bits   -2,147,483,648 to 2,147,483,647
                long        8 bytes 64 bits   -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
                float       4 bytes 32 bits   Sufficient for storing 6 to 7 decimal digits
                double      8 bytes 64 bits   Sufficient for storing 15 decimal digits
                char        2 bytes 16 bits   Stores a single character/letter or ASCII values        Stores true or false values
                boolean     depends on the internal implementation
         */
        byte b = 10 ;
        System.out.println(b);
        b = 120 ;
        System.out.println(b);
        b=-128 ;

        short c = 128 ;

        System.out.println(b+c) ;
        double t = 0.5 ;

        System.out.println(c-t);

        // Any constant value in java is called a literal
        // By default all integral values within the range of int are treated as int literal

        byte age = 50 ;

        short s = 200;
        System.out.println(s) ;

        int salary = 465465 ;

        //int phone_number = 75465245624 ;

        //TO specify a long literal we use the suffix L

        long phone_number = 87987484546546L ;

        // if we use a literal within the range of int, the literal is by default treated as an int literal.
        // so suffix L is not required.










    }
}
