package Said_pampala_tatli_hatiralar;

import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s;
        s = scan.nextLine();
        System.out.println("Enter a character to find index for:");
        char ch = scan.next().charAt(0);

        if(s.indexOf(ch) == -1)
            System.out.println("character '" + ch + "' is not there!");
        else {
            int i;
            i = s.indexOf(ch);

            while(i >= 0) {

                System.out.print(i + "\t");
                i = s.indexOf(ch, i+1);
            }
        }
    }
}