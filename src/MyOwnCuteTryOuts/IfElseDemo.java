package MyOwnCuteTryOuts;

public class IfElseDemo {
    public static void main(String[]aq){
        int i=5, j=2;



        if (i * j >= 10) {
            i++;
            j--;
            int r = i * j;
            System.out.println(r + r);

        }
        else{
            int r = ++i * --j;
            System.out.println(r);

        }
        System.out.println(i + "\n" + j);
    }
}
