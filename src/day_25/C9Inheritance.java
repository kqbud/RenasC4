package day_25;

public class C9Inheritance {
    public static void main(String[] args) {
        Evlat9 e = new Evlat9();
        //Method Overriding
        //Below call uns the show() of the child class
        //show in the Evlat9 class overrrides show in Baba9
        e.show();
    }
}
//Parent class OR Super class OR Base class
class Baba9{
    //overridden method
    void show(){

        System.out.println("Hello");
    }
}
//Child class OR Sub class OR Derived class
class Evlat9 extends Baba9{
    //overriding method OR Override
    void show(){
        System.out.println("Hi");
    }
}