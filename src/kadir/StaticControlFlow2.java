package kadir;

public class StaticControlFlow2 {


        static int i = 10;

        static {
            method();
            System.out.println("Another Static method"); //static method
        }

        StaticControlFlow2() {
            System.out.println("Merhaba");
            method();
            System.out.println("Class");
        }
        {
            System.out.println("Slaw");
        }

        public static void main(String[] args) {
            new StaticControlFlow2();
            StaticControlFlow flow=new StaticControlFlow();
            method();
            System.out.println("Method");
            //System.out.println(i);
        }
        static {
            System.out.println("Static Block"); //static block
        }

        static void method() {
            System.out.println(i);
            //static metohod
        }
        {
            System.out.println("Hello"); //
        }
    }

