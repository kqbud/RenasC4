package k.KadirChallenge;

public class SumOfNumbers2 {
    public static void main(String[]kadir){
        double x, y=1000, sum=0, say=1;

        for( x=1; x<=y; x++ ){
            if(x%3==0 && x%5==0 && say<6) {
                say++;
                System.out.println(x);
                sum = sum + x;
            }




        }
        System.out.println(sum);
    }
}
