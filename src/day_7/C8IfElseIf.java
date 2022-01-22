package day_7;

import org.w3c.dom.ranges.Range;

public class C8IfElseIf {
    public static void main(String[]cc){
        /*
        Number   Word
        50-60   mango
        65-98   orange
        10-40   red
         */
        int number = 40;
        if(number>=50 && number <=60) System.out.println("Mango");
        if(number>=65 && number <=98) System.out.println("Orange");
        if(number>=10 && number <=40) System.out.println("Red");

        int population= 5564, area=5462 ;
        if(area<=10000 && population<=10000) System.out.println("Small Country");
        else if(area>10000 && population>10000) System.out.println(
                "population is greater than 10000 and area is also greater than 10000"
        );
        else if(area>10000 && population<10000)
        System.out.println("population is greater that 10000\n" +
                "but area is less than 10000");
        else if(area<10000 && population>10000)
            System.out.println("population is less than 10000 but area is greater than 10000") ;
    }
}
