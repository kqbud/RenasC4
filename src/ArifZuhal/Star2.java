package ArifZuhal;

public class Star2 {
    public static void main(String[] args) {

        for (int r = 1; r <= 5; r++) {
            for (int i = 5-r; i >=1; i--) {
                System.out.print(" ");

                //System.out.println();
            }
            for (int c = 1; c <= r; c++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

}
