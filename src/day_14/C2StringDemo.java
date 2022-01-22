package day_14;

public class C2StringDemo {
    public static void main(String[] args) {
        /*
        String str = "Hello";
        System.out.println(str.length());
        System.out.println();
        String str2 = new String("Hi");
        System.out.println(str2.length());

        System.out.println("slav".length());
        System.out.println("slav".charAt(3));
                 */
        String s1="Metallica";//pool object
        String s2= new String("Metallica");//heap object
        String s3= "Metallica";//pool object
        System.out.println(s1==s3);
        System.out.println(s1==s2);
        String s4= "Metallica";
        String s5= "Metallica";
        String s6= new String("Metallica");
        System.out.println(s1==s4);
        System.out.println(s4==s5);
        System.out.println(s5==s1);
        System.out.println(s2==s6);
        System.out.println(10==10);
    }
}
