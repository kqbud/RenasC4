package day_10;

public class C1Revision {
    public static void main(String[]prime){
        int n= 10;
        int no_of_numbers=2;
        boolean isPrime = true;
        for(int i = 2; i<n; i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        if (isPrime)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime");
    }
}
