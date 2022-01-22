package PracticeWithClassMate;

import java.util.Scanner;

public class D2ScannerMoney {
    public static void main(String[]aq){
        Scanner variable = new Scanner(System.in);
        System.out.println("Enter a Salary");
        int salary = variable.nextInt();
        if(salary<1000)
            System.out.println("poor bastard");
        else if(salary>=1000 && salary<=10000)
            System.out.println("Software Tester");
        else if(salary>10000 && salary<=25000)
            System.out.println("Software Developer");
        else if(salary>25000 && salary<=50000)
            System.out.println("Project Manager");
        else if(salary>50000 && salary<=100000)
            System.out.println("Team Leader");
        else
            System.out.println("HR");

        // else if koymazsan butun satirlari tektek kontrol eder aradigini bulsa bile
        // else if koyarsan aradigini bulduktan sonra devamini kontrol etmez
    }
}
