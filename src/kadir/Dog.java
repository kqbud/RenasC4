package ForAdem;

public class Dog extends Bird{


    public Dog(String breed, String color, int age) {
        super(breed, color, age);
    }


    void bark(){
        System.out.println("Dog can bark");
    }

    @Override
    public String toString() {
        return "\nDog" +
                "\nbreed= " + getBreed() +
                "\ncolor= " + getColor() +
                "\nage= " + getAge() ;
    }
}
