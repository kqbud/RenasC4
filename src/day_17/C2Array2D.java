package day_17;

public class C2Array2D {
    public static void main(String[] args) {
        //A 2D array is basically an array of arrays
        //It is a Jagged or Ragged array

        //int arr[][]; arr=new int[3][];

        //arr = new int[3][3]; a valid syntax if each sub array should be of the same size

        int arr[][]=new int[3][];
        arr[0] = new int[4];
        arr[1]= new int[3];
        arr[2]= new int[5];

        System.out.println(arr[2][0]);
        System.out.println(arr[2][4]);

        arr[0][2]=5;
        arr[2][1]=7;

        System.out.println(arr[0][2] + arr[2][1]);
        /*
        String nufus[][]=new String [2][];
        nufus[0]=new String[43437587];
        nufus[1]=new String[42986432];

         */
    }
}
