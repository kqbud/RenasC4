package ArifZuhal;
import java.util.Scanner;
public class aslanKod {

        public static void main(String[] args) {

            Scanner scn = new Scanner(System.in);
            //int a = scn.nextInt();


            int [][] arr = calculateArray(3);

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j]+ " ");
                }
                System.out.println();
            }
        }
        public static int [][] calculateArray(int n){
            int [][] array = new int[n][n];
            int temp=0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    if (temp%2==0) {
                        temp=0;
                    }
                    else temp=1;
                    array[i][j]=temp;
                    temp++;
                }
               if(n%2 == 0) temp++;
            }
            return array;
        }
    }

