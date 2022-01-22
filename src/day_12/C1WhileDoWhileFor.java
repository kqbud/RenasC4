package day_12;

public class C1WhileDoWhileFor {
    public static void main(String[]asjf){
        System.out.println("using while loop");
        int j=0;
        while(j<=5){
            System.out.println(j++);
        }
        System.out.println("\nusing for loop");
        for(int i = 2; i<=5;){
            System.out.println(i++);
        }
        System.out.println("\nusing do while loop");
        int k=1;
        do{
            System.out.println(k++);
        }while(k<=5);
    }
}
