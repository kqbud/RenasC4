package day_19;

public class C9MethodDemo {
    public static void main(String[] args) {
        int arr[] = {10,20,30,5};

        printArray (arr);

        int arr2[]={3,9,8};
        System.out.println("\nSecond Array");
        printArray(arr2);
        int volkan[]={31,31,31};
        System.out.println("third array");
        printArray(volkan);
    }

    //printArray method takes int type array as argument
    static void printArray( int[]falanfilan){
        for(int i=0; i<falanfilan.length; i++){
            System.out.println(falanfilan[i]);


        }
    }
}
