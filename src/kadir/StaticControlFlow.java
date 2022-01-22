package kadir;

public class StaticControlFlow {

        static int i = 10;

    /*Static Block
    Another Static
    Method
    */

        StaticControlFlow() {
            System.out.println("Merhaba");

        }


        public static void main(String[] args) {
            System.out.println("Method");
            new StaticControlFlow();
            new StaticControlFlow();
            method();
            System.out.println(i);
        }

        static {
            System.out.println("Static Block"); //static block
        }

        static void method() {
            System.out.println(i);
            //static metohod
        }

        static {
            System.out.println("Another Static method"); //static method
        }
        {
            System.out.println("Hello"); //
        }
    }