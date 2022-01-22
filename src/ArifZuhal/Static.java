package ArifZuhal;

public class Static {
    public static void main(String[] args) {
        chuck.check();
        new chuck().keyboard();


    }
}

class chuck{
    static void check(){
        System.out.println("burasi static check");
    }

    void keyboard(){
        System.out.println("burasi non static keyboard");

    }

}