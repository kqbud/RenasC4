package MyOwnCuteTryOuts;

public class primedeneme {
    public static void main(String[] args) {
        int n= 10;
        boolean isPrime = true;
        for(int i = 2; i<n; i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        if(isPrime)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime");
    }
    }

