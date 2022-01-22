package day_6;

public class C5IfPractice {
            /*
        Points      Grades
        91 - 100    A
        75-90       B
        60-74       C
        40-59       D
        <40         E
            */
    public static void main(String[] args) {

        int points = 95; char grade=' ';

        if(points>=91) grade='A';

        if(points>=75) grade='B';

        System.out.println(grade);

        int i=0, j=5;
        if(j<40) i++;
        if(j>50) i = 6+i;
        if(j==50){
            ++i;
            j=j+i;
        }
        System.out.println(j);
        System.out.println(i);
    }
}
