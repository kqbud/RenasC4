package PracticeWithClassMate;

import java.util.Scanner;

public class D3SwitchCaseSeasons {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        System.out.println("Enter a Month");
        String season;
        int month;
        month=variable.nextInt();

        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("Get a coat!");
                season = "Winter";
                System.out.println(season);
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Let's go for a walk!");
                season= "spring";
                System.out.println(season);
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaniyuruk amina goyum");
                season="Summer";
                System.out.println(season);
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("seker miyiz eriyelim amk");
                season="Autumn";
                System.out.println(season);
                break;
            default:
                System.out.println("hayat bilgisi hocani sikiyim");
                season="\"Mayista Turkiye Alev Alev\" - Dr. Dogu Perincek";
                System.out.println(season);

        }
    }
}
