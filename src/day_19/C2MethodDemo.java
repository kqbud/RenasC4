package day_19;

public class C2MethodDemo {

        int show(int a){
            int b = a*a;
            return a+b;
        }

        static String m1 (int b){
            return "Hello" +b;
        }


        public static void main(String[]aq){
            m1(50);

            String str = m1(60);
            System.out.println(m1(40));
            System.out.println(str);

            System.out.println(m1(50));

        }
}

