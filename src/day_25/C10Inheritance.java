package day_25;

public class C10Inheritance {
    public static void main(String[] args) {
        Evlat10 e = new Evlat10();
        e.show();
    }
}

class Dede10{

    void show(){
        System.out.println("Hello");
    }
}

class Baba10 extends Dede10{
    //Overridden method
    void show(){System.out.println("hi");}
}

class Evlat10 extends Baba10{
    //Overriding OR Override Method
    void show(){System.out.println("Chai");}
}