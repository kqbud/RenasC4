package day_26;

public class C3Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.show();

        new Child() . show();
        // below prints a from the child class
        //variable a from the child class hides the variable a from the base class
        // this concept is called data hiding
        System.out.println(new Child().a);
    }
}

class Base{
    int a = 10;
    void show(){
        System.out.println("hello");
    }
}

class Child extends Base{
    int a = 20, b = 30;
    void show(){
        System.out.println("hi");
    }
}