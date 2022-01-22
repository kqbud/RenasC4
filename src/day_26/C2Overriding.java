package day_26;

public class C2Overriding {
    public static void main(String[] args) {
        Apple a =new Apple();
        System.out.println(a.getPrice());
    }
}
//super class || parent class || base class
class Fruit{
    int price = 10;

}
//sub class || child class|| derived class
class Apple extends Fruit{
    int price = 20;
    int getPrice(){
        return price;
    }
}