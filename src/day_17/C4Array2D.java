package day_17;

public class C4Array2D {
    public static void main(String[]aq){
        int arr[][] = {
                {1,2,3,},{4,5,6},{7,8,9}
        };
        //System.out.println(arr.length);
        //System.out.println(arr[1].length);

        for(int i=0; i<arr.length; i++){
            //inner loop prints the rows and outer loop prints the columns
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
        }

    }
}

