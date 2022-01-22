package day_22;

public class C2Object {
    public static void main(String[] args) {
        Book b1 = new Book();
        //System.out.println(b1.title);
        //System.out.println(b1.price);
        b1.setPrice(10);
        b1.setTitle("1984");
        b1.setAuthor("George Orwell");
        System.out.println(b1.getPrice()+" lira");
        System.out.println(b1.getTitle());
        System.out.println(b1.getAuthor());


        Book b2 = new Book();
        b2.setTitle("Animal Farm");
        b2.setPrice(5);
        b2.setAuthor("George Orwell");
        System.out.println(b2.getPrice()+" lira");
        System.out.println(b2.getTitle());
        System.out.println(b2.getAuthor());


        Book b3 = new Book();
        b3.setTitle("At the Mountain of Madness");
        b3.setPrice(4);
        b3.setAuthor("Howard Lovecraft");
        System.out.println(b3.getPrice()+" lira");
        System.out.println(b3.getTitle());
        System.out.println(b3.getAuthor());
    }
}

class Book{
    //Object-oriented approach says the instance variables should be accessed
    // via functionalities.
    //Make the variables private to achieve Encapsulation
    private String author;
    private String title ;
    private double price ;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    //Constructor
    //a constructor is a special method in a class with no return type.
    //It name is same as the name of the class.
    //A constructor is always called whenever an object is created using new operator
    //Book(){}
}

