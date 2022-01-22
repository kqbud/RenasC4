package kadir;

public class Rectangle {

   /*
   The Swimming Company has asked you to write an application that calculates the volume of cuboid-shaped pools.
    1. Write a class with the name Rectangle. The class needs two fields (instance variable) with name width and length both of type double.
    The class needs to have one constructor with parameters width and length both of type double and it needs to initialize the fields.
    In case the width parameter is less than 0 it needs to set the width field value to 0.
    In case the length parameter is less than 0 it needs to set the length field value to 0.
    Write the following methods (instance methods):
    Method named getWidth without any parameters, it needs to return the value of width field.
    Method named getLength without any parameters, it needs to return the value of length field.
    Method named getArea without any parameters, it needs to return the calculated area (width * length).

    NOTE: All methods should be defined as public NOT public static.
    NOTE: In total, you have to write 2 classes.  Do input following steps..

    Rectangle rectangle = new Rectangle(5, 10);
System.out.println("rectangle.width= " + rectangle.getWidth());
System.out.println("rectangle.length= " + rectangle.getLength());
System.out.println("rectangle.area= " + rectangle.getArea());
Cuboid cuboid = new Cuboid(5,10,5);
System.out.println("cuboid.width= " + cuboid.getWidth());
System.out.println("cuboid.length= " + cuboid.getLength());
System.out.println("cuboid.area= " + cuboid.getArea());
System.out.println("cuboid.height= " + cuboid.getHeight());
System.out.println("cuboid.volume= " + cuboid.getVolume());
    */

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }


    public double getWidth(){
        if (width<0)
            return width=0;
        else return width;
    }

    public double getLength() {
        if(length<0)
            return length=0;
        else return length;
    }
    public double getArea(){

        return getWidth() * getLength();
    }


    @Override
    public String toString() {
        return "\nRectangle " +
                "\nwidth= " + getWidth() +
                "\nlength= " + getLength();

    }

}
