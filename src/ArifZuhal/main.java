package ArifZuhal;

public class main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(76,95);
        System.out.println("width: " + r1.getWidth() + "\nlength: " + r1.getLength() + "\narea: " + r1.getArea());

        Cuboid c1 = new Cuboid(87,59, 120);
        System.out.println("width: "+c1.getWidth()+"\nlength: "+c1.getLength()+"\nheigth: "+c1.getHeight()+
                "\nvolume: "+c1.getVolume());


    }
}
