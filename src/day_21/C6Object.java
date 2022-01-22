package day_21;

public class C6Object {

    public static void main(String[] args) {
        Box b1 = new Box();
        System.out.println("breadth" + b1.breadth+"cm");
        System.out.println("length" + b1.length+"cm");
        System.out.println("height" + b1.height+"cm");
        System.out.println("volume" + b1.volume());
        b1.length = 10;
        b1.breadth = 5;
        b1.height = 2.2;
        System.out.println("breadth" + b1.breadth+"cm");
        System.out.println("length" + b1.length+"cm");
        System.out.println("height" + b1.height+"cm");
        System.out.println("volume" + b1.volume()+"cb m");
    }
}

class Box{
    //properties of the box object
    double length;
    double breadth;
    double height;


    //behaviour of the box object
    double volume(){
        return length*breadth*height;
    }
}
