package day_26;

public class C6Inheritance {
    public static void main(String[] args) {
        Child2 c = new Child2();
    }
}
//Constructors in Inheritance
//Before the child class constructor runs, its immeadiate parent constructor will run
class Dede2{
    Dede2(){
        System.out.println("chao");
    }
}

class Base2 extends Dede2{
    Base2(){
        System.out.println("Hello");
    }
}

class Child2 extends Base2{
    Child2(){
        System.out.println("hi");
    }
}
