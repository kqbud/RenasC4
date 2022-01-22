package ForAdem;

public class Cat extends Bird{


    public Cat(String breed, String color, int age) {
        super(breed, color, age);
    }

    void sleeping(){
        System.out.println("Cat is sleeping");
    }

    @Override
    public String toString() {
        return "\nCat " +
                "\nbreed= " + getBreed()  +
                "\ncolor= " + getColor() +
                "\nage= " + getAge() ;
    }
}
