package day_8;

public class C6SwitchCase {
    public static void main(String[]evsd){
        double a=10, b=20;
        System.out.println("Numbers are a=" +a+ "\tb=" +b);
        System.out.println("Give an option \n1 for addition\n2 for subtraction\n3 for multplication\n4 for division" +
                "\n5 for modulus");

        int option=4;
        switch(option){
            case 1: System.out.println("this is case1");
                    System.out.println("a+b=" + (a+b));
                    break;
            case 2: System.out.println("This is case 2");
                    System.out.println("a-b=" + (a-b));
                    break;
            case 3:System.out.println("This is case 3");
                   System.out.println("a*b=" + (a*b));
                   break;
            case 4:System.out.println("This is case 4");
                System.out.println("a/=b" + (a/b));
                break;
            case 5:System.out.println("This is case 5");
                System.out.println("a%b=" + (a%b)) ;
                break;
            default:System.out.println("invalid entry");
        }
    }
}
