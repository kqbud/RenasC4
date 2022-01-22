package day_8;

public class C1Revision {
    public static void main(String[]we){
        /*
        Salary              Designation
        <1000               Not an employee
        >=1000 and <=10000  Software Tester
        >10000 and <=25000  Software Developer
        >25000 and <=50000  Project Manager
        >50000 and <=100000 Team Leader
        else                HR Manager
         */

        int sal=25300;
        if(sal<1000)        System.out.println("Not an employee");
        if(sal>=1000 && sal<=10000) System.out.println("Software Tester");
        if(sal>10000&&sal<=25000)  System.out.println("Software Developer");
        if(sal>25000&&sal<=50000) System.out.println("Project Manager");
        if(sal>50000&&sal<=100000) System.out.println("Team Leader");
        else System.out.println("HR");

        // else if koymazsan butun satirlari tektek kontrol eder aradigini bulsa bile
        // else if koyarsan aradigini bulduktan sonra devamini kontrol etmez

    }

}
