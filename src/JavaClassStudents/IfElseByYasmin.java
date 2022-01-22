package JavaClassStudents;

public class IfElseByYasmin {
    public static void main(String[]aq){

//You're a tour manager and need a program that will identify small countries.
//A country is considered small if its population is under 10000 and its area is under 10000 hectares.
//The given program takes population and area as input.
//Task
//Complete the program to output "small country" if both conditions are met. Don't output anything otherwise.

                int population = 9846, area = 85745;
                if(population<10000){

                    if(area<10000){
                        System.out.println("It is a small country");
                    }
                    else
                        System.out.println("Population is less than 10000 but area is greater than 10000");
                }


            }
        }


