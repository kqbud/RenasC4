package asignments;

public class HomeworkDec13 {
    public static void main(String[]aq){
        //Q1-Consider the marks of following five subjects  and print the Percentage and result based on that percentage.
        //Georgian, English, Maths, Science, Computers. Marks should be out of 100.
        //Percentage=(Total Marks of all 5 subjects/500)*100.
        int Georgian, English, Maths, Science, Computers ;
        Georgian = 70 ; English = 80 ; Maths = 45 ; Science = 50 ; Computers = 70 ;
        int percentage = ((Georgian + English + Maths + Science + Computers)/5);
        if(percentage <40)
            System.out.println("You have Failed") ;
        else if(percentage <50)
            System.out.println("THIRD");
        else if(percentage<60)
            System.out.println("SECOND");
        else if(percentage<75)
            System.out.println("FIRST");
        else
            System.out.println("FIRST WITH DISTINCTION");
        System.out.println("---------------------------");

        //Q2-WAP to enter two numbers and swap them using a third variable and print them .
        int x, y, z ;
        x = 31 ; y = 52 ;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        z = x ;
        x = y ;
        y = z ;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("---------------------------");

        //Q3- WAP to enter a number and swap and print them without using a third variable.
        //??????????
        int a=10;
        int b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+ a +"\nb="+b);
        System.out.println("---------------------------");


        //WAP to taking a distance in Kilometers(km) and print equivalent distance in meters(m), feet(ft), inches(in) and centimeters(cm).
        //	1 km = 1000 m =>  m = km*1000
        //	1 m = 3.3 ft  =>  ft= m * 3.3
        //	1 ft = 12 in  =>  in= ft * 12
        //	1 m = 100 cm  =>  cm= m * 100
        double km, m, ft, in, cm ;
        km=75;
        m=km*1000;
        ft=m*3.3;
        in=ft*12;
        cm=m*100;
        System.out.println("km="+km+"\n"+"m="+m+"\n"+"ft="+ft+"\n"+"in="+in+"\n"+"cm="+cm);
        System.out.println("---------------------------");
        //Q4- WAP to print the reverse of a four digit number
        int amk = 5324, lan;

        int hane1 = amk/1000;
        int hane4 = amk%10;
        int hane3 = amk/10%10;
        int hane2 = amk/100%10;
        lan = (hane4*1000 + hane3*100 + hane2*10 + hane1);
        System.out.println(lan);












    }
}
