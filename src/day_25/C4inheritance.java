package day_25;

public class C4inheritance {
    public static void main(String[] args) {
        BMW b = new BMW(); b.accelerate();
        new Car()  . accelerate();
    }

}

class Car{
    void accelerate(){
        System.out.println("accelerating..");
    }
}

//Inheritance works only with the extends keyword
//bmw id the child classs of the car class
//bmw is a car
class BMW extends Car{


}