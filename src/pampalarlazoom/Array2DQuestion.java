package pampalarlazoom;
import java.util.Scanner;
public class Array2DQuestion {
    public static void main(String[] args) {
        /*
        WAP to enter the dimensions(no. of rows and columns) of a 2-D array and then enter the  elements and
        print them. Also, print the sum and average of the elements.
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the no. of the rows");
        double sum = 0;
        double average;
        int r = scan.nextInt();

        System.out.println("Enter the columns");

        int c = scan.nextInt();

        int arr[][]=new int[r][c];

        System.out.println("Enter the elements");

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=scan.nextInt();
            }
        }
        System.out.println("Entered array is: ");
        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ "\t");
                sum=sum + arr[i][j];

            }
            System.out.println();
            average=sum/(c*r);
            System.out.println("sum: " +sum);
            System.out.println("average: " +average);
        }
    }
}
