package day_7;

public class C9Logical {
    public static void main(String[] args) {
        int a = 1000000, p = 800;
        if (a<100000 && p<100000) System.out.println("small country");
        else if (a<100000 && p>100000) System.out.println("area small, population big");
        else if (a>100000 && p<100000) System.out.println("area big, population small");
        else if (a>100000 && p> 100000) System.out.println("big country");

    }
}
