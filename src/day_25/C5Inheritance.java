package day_25;

public class C5Inheritance {
    public static void main(String[] args) {
        //Multiple inheritance is not allowed in java
        Child1 c = new Child1(); c.show();
    }
}
class A{
    void show(){
        System.out.println("Hello");
    }
}

class B{
    void show(){
        System.out.println("Hello");
    }
}

class C{
    void show(){
        System.out.println("Hello");
    }
}

class Child1 extends A{

}