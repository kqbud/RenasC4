package day_18;

public class C3MEthodsDemo {
    public static void main(String[] args) {
        //any variable declared inside a method is called a local variable
        int i = 10;
        System.out.println("hello people!");
        m1();//first m1 method call will be resolved, then below statements are executed
        System.out.println("bye"); m2();
    }
    static void m1(){
        m2();
        int j =50; // local variable
        System.out.println("m1 method" + j);
        m2();
    }
    static void m2(){
        int k =30;// local variable
        System.out.println("m2 method");

    }

}
