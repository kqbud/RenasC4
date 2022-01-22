package day_26;

public class C4Inheritance {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.toString());
        System.out.println(c);

        B b=new B();
        System.out.println(b.toString());
        System.out.println(b);

        A a = new A();
        System.out.println(a.toString());
        System.out.println(a);
    }
}

class A{

}
class B extends A{

}
class C extends B{
 public String toString(){
     return "slaw";
 }
}