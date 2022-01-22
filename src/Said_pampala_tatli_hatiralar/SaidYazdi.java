package Said_pampala_tatli_hatiralar;

import java.util.Scanner;

public class SaidYazdi {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Tek mi cift mi? Tekse t ciftse c de gonder");
            char ch =  scan.next().charAt(0);

            if (ch == 't')
                System.out.println("Tek cikti");
            else if (ch == 'c')
                System.out.println("Cift cikti");
            else
                System.out.println("Elinin ayarini sikim");
        }
    }

