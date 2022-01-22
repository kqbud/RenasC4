package day_22;

public class C3Constructor {
    /*
    Constructor
    a constructor is a special method in a class with no return type.
    It name is same as the name of the class.
    A constructor is always called whenever an object is created using new operator
     */
    public static void main(String[] args) {
        new Movie();// anonymous movie object i.e. reference variable is not declared
        new Movie();

        Movie m1=new Movie("Titanic",(short)1997,"Leonardo Dicaprio");
        m1.watchMovie();
        System.out.println();
        System.out.println(m1.toString());

        Movie m2=new Movie("Yes Man", (short)2008,"Jim Carey");
        m2.watchMovie();
        System.out.println();
        System.out.println(m2.toString());

        Movie m3=new Movie("The Matrix",(short)1999,"Keanu Reeves");
        m3.watchMovie();
        System.out.println();
        System.out.println(m3.toString());

    }
}

class Movie{
    private String title;
    private String actor;
    private short year;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    void watchMovie(){
        System.out.println("watching "+this.title+"....");
    }
    /*
    Default constructor created by the jvm
    public Movie(){}
     */
    Movie(){}
    Movie(String title, short year, String actor){
        this.title=title;
        this.year = year;
        this.actor=actor;
        System.out.println("Constructor is called");
    }

    public String toString(){return (getActor()+"\t" + getTitle()+ "\t" + getYear()); }


}
