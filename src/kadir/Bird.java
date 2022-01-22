package ForAdem;

public class Bird {
    private String breed;
    private String color;
    private int age;
    private int legs;

    public Bird(String breed, String color, int age) {
        this.breed = breed;
        this.color = color;
        this.age=age;

    }
    public Bird(int legs){
        this.legs=legs;
    }

    public int getLegs() {
        return legs;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
    void flying(){
        System.out.println("Bird can fly");
    }

    @Override
    public String toString() {
        return "\nBird" +
                "\nbreed= " + breed  +
                "\ncolor= " + color  +
                "\nage= " + age +
                "\nLeg of Birds= " + legs;
    }
}
