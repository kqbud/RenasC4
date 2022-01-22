package day_26;

public class C1Revision {
    public static void main(String[] args) {
        Mercedes m = new Mercedes();
        m.show();
    }
}

class Car{
    int i = 10;
    //overriden method
    void show(){
        System.out.println("hello");
    }
}

class Mercedes extends Car{
    //overriding OR override method
    void show(){
        System.out.println("Hi");
    }
}