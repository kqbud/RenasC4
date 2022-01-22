package day_25;

public class C8Inheritance {
    public static void main(String[] args) {
        Evlat8 e = new Evlat8();
        e.show();
        e.display();
    }
}

class Dede8{
    void show(){
        System.out.println("Hello");
    }
}

class Baba8 extends Dede8{
private void play(){
    System.out.println("hi");
}
void display(){ play();}
}

class Evlat8 extends Baba8{
    private int i = 5;
}