package day_8;

public class C5SwitchCase {
    public static void main(String[] args) {
        int option = 4;


        switch (option){
            case 1:
                System.out.println("Hello");
            case 2:
                System.out.println("Merhaba");
            default:
                System.out.println("eat more noodles you poor bastard!"); break;
            case 3:
                System.out.println("Selamun Aleykum");
                break;
            case 4:
                System.out.println("Esenlikler");





        }
        if (option == 1) System.out.println("Hello");
        else if (option == 2) System.out.println("Slav");
        else if (option == 3) System.out.println("Eat Noobles");
        else if (option == 4) System.out.println("Salam");
        else System.out.println("Chao");
    }
}
