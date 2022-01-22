package asignments;

import java.util.Scanner;

public class equalsIgnoreCase {
    public static void main(String[] args) {
        String Username= "proCoder";
        String Password= "juT7%$";
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Username:");
        String username = scan.next();
        System.out.println("Enter password:");
        String pass = scan.next();

        if(username.equalsIgnoreCase(Username) && pass.equals(Password)){
            System.out.println("Login successful");

        }
        else System.out.println("Login is not successful");
    }
}
