package ArifZuhal;

public class picak {
    //folding knives
    public static void main(String[] args) {
        knife f1 = new knife("Camping Knife","Folding",7.4);

        System.out.println(f1.toString());

        knife f2= new knife("Kitchen knife","Unfoldable", 10 );

        System.out.println(f2.toString());
    }
}
class knife{
    private String type, category;
    private double length;

    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setType(String type){this.type=type;}

    public knife(String type, String category, double length){
        System.out.println("bura constructor");
        this.type=type;
        this.category=category;
        this.length=length;
    }
    public String toString(){return(getType()+"\t"+getCategory()+"\t"+getLength()+"\tcm");}

}