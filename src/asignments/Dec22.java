package asignments;

import java.util.Scanner;

public class Dec22 {
    public static void main(String[]aq){
        /*
        WAP to count the number of digits, lower case alphabets,
        upper case alphabets, special characters(like %,* etc) and
        spaces in a string.
        Unicode values corresponding to the digits are 48 to 57.
        OUTPUT:
        ------
        Enter a string:
        Hello 123*&
        Digits in the entered string: 3
        Upper case letters: 1
        Lower case letters: 4
        Spaces: 1
        Special characters: 2

Press y to continue or any other key to stop
         */
        Scanner scan= new Scanner(System.in);
        int countSpace= 0;
        int countUpper= 0;
        int countLower= 0;
        int countSpecial= 0;
        int countNumber= 0;
        boolean isContinue=true;
        char checking;

        while(isContinue){
            System.out.println("Please write enter a string: ");
            String name = scan.nextLine();
            //System.out.println("Yazdigin ifade su babus: " + name);


            for(int j=0; j<name.length(); j++){
                if(name.charAt(j)>64 && name.charAt(j)<91){
                    countUpper++;
                }
                else if(name.charAt(j)>96 && name.charAt(j)<123){
                    countLower++;
                }
                else if(name.charAt(j)>47 && name.charAt(j)<58){
                    countNumber++;
                }
                else if(name.charAt(j)==32){
                    countSpace++;
                }
                else{
                    countSpecial++;
                }
            }
            System.out.println("Number of word is: " + countNumber);
            System.out.println("Upper of word is: " + countUpper);
            System.out.println("Lower of word is: " + countLower);
            System.out.println("Special of word is: " + countSpecial);
            System.out.println("Space of word is: " + countSpace);
            System.out.println("Do you wish to continue? y/n");
            checking = scan.next().charAt(0);
            //System.out.println("enter oncesi");
            scan.nextLine();
            //System.out.println("enter sonrasi");
            if(checking=='y'){
                isContinue = true;
                countSpace= 0;
                countUpper= 0;
                countLower= 0;
                countSpecial= 0;
                countNumber= 0;

            }
            else isContinue = false;
        }
    }
}
