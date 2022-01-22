package day_5;

public class C2_ClassAssignment {
    public static void main(String[]amk){

        int i = 568 , sum;
        //Write code here to seperate out the digits of
        //the above number and print the sum of these
        //digits 5+6+8
        //sum=5+6+8; not allowed
        int digit1 = i%10;//8 is the last digit of 568
        int new_number = i/10;//56
        int digit2 = new_number%10;//6
        new_number=new_number/10 ;
        int digit3 = new_number%10;//56%10

        System.out.println(digit1 +"\t" + digit3 + "\t" + digit2);
        sum = digit1 + digit2 + digit3;

        System.out.println(sum);
    }
}
