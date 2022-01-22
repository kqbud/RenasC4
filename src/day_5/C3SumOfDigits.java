package day_5;

public class C3SumOfDigits {
    public static void main(String[]aq){

        int n = 1234;

        int sum_of_digits = (n/1000) + (n/100)%10 + (n/10)%10 + n%10;

        System.out.println(sum_of_digits);

    }
}
