package day_7;

/*
SALARY
10000k to50000 go to california
50000 to 90000 go to Europe
>120k go on a World Tour
<10000 go to a Park
 */


public class C4IfElse{
    public static void main(String[]amc){
        int salary = 4800 ;
        if(salary<10000)
            System.out.println("Go to the Park");
        else {
            if (salary < 50000)
                System.out.println("Go to California");
            else {
                if (salary < 90000)
                    System.out.println("Go to Europe");
                else {
                    if (salary > 90000)
                        System.out.println("G on a World Tour");
                }
            }


        }
    }

}
