package day_7;

public class C5IfElse {
    public static void main(String[] args) {
        /*
        Points      Grades
        91 - 100    A
        75-90       B
        60-74       C
        45-59       D
        <45         F
    * */
        int grade=74;
                if(grade<45) System.out.println("F");
                else if(grade<=59) System.out.println("D");
                else if(grade<=74) System.out.println("C");
                else if (grade<=90) System.out.println("B");
                else if(grade>=91) System.out.println("A");
    }
}
