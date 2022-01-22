package day_23;

public class C5StaticInstance {
    public static void main(String[] args) {
        show();
        C5StaticInstance.show();
        Temp.display();
        Temp t = new Temp(); t.display();
        t.display(); // Temp . display();
    }

    static void show(){
        System.out.println("hello");
    }

    void play(){
        System.out.println("Hi");
    }
}

class Temp{
    static void display(){
        System.out.println("Slaw");
    }
}