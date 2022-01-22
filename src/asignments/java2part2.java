package asignments;

public class java2part2 {
    public static void main(String[]aq){
        System.out.println("2.) Write a Java program that prints the multiplication table of a number. For example, below is the output for multiplication table of 2.\n" +
                "OUTPUT\n" +
                "----------\n" +
                "2 * 1 = 2\n" +
                "2 * 2 = 4\n" +
                "2 * 3 = 6\n" +
                "2 * 4 = 8\n" +
                "      .\n" +
                "      .\n" +
                "      .\n" +
                "2 * 10 = 20");

        int n = 7 ;
        for (int x = 1 ; x <= 10 ; ++x ){
            System.out.println(n + "*" + x + "=" + (n * x) );

        }
    }
}
