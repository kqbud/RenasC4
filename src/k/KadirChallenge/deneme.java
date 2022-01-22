package k.KadirChallenge;

public class deneme {
    public static void main(String[] args) {
        int sum=0, say=0, x, y=1000;
        for (x = 1; x <= y; x++) {

            if (x % 3 == 0 && x % 5 ==0){
                System.out.println(x);
                sum = sum + x;
                say++;
            }
            if(say == 5) break;


        }
        System.out.println(sum);
    }
}
