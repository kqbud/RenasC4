package day_16.Array;

public class C1ArrayDemo {
    // A string is a sequence of individual characters
    //Anything in double quotes in Java is a String object in the pool area.
    //String objects are immutable i.e. once created they cannot be changed
    /*
    String Constant Pool Objects:
            -They are immutable
            -Duplicates are not allowed on the pool area
     */
    public static void main(String[] args) {
        //int i = 10;

        int i; //declaration
        i =10; // initialization

        String name1 = "Zelal";
        String name2 = "Mihrican";
        String name3 = "kqBud";
        String name4 = "Ruben";


        //String names[] = new String[50];
        String names[];
        names =new String[50];

        System.out.println(names.length);
        names[0] = "Kefo";
        names[5] = "Esther";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[5]);
        names[5]="Volkan";
        System.out.println(names[5]);
        System.out.println("-----------");

        for(int a = 0; a<names.length; a ++){
            System.out.println(names[a]);
        }

    }
}
