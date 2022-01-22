package day_21;

public class C5Object {

    public static void main(String[] args) {
        //c is a reference variable and a local variable
        //create an instance of the class car
        Car c= new Car();
        System.out.println(c.color);
        System.out.println(c.type);
        c.accelerate();
    }
}

class Car{

    //properties fo the car object OR instance variables
    String color= "Red";
    String type="Sedan";
    //instance method represents the behaviour of the object

    void accelerate(){

        System.out.println("push accelerator");
    }

}
