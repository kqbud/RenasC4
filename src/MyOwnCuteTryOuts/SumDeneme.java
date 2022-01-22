package MyOwnCuteTryOuts;

import java.sql.SQLOutput;

public class SumDeneme {
    public static void main(String[] args) {
        int y = 7777 , sum;
        int hane1 = y/1000;
        int hane4 = y%10;
        int hane3 = y/10%10;
        int hane2 = y/100%10;
        sum = hane1 + hane2 + hane3 + hane4;
        System.out.println(sum);

    }
}
