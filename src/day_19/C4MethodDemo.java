package day_19;

public class C4MethodDemo {
    public static void main(String[]aq){

        System.out.println(add(5.2,1.1));
        //System.out.println(parrot()); as parrot does not return anything
        parrot();
        return;
    }

    static void parrot(){
        System.out.println("Konk konk!!");

    }

    static double add(double a, double b){
        System.out.println("jay-z");
        return a+b;
    }
}

