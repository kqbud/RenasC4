package day_6;



public class C6IfElse {
    public static void main(String[] args) {
        {
            int i = 1, j = 10;
            if (i == j)


                i = i + j;
            else
                i = ++i + j;

            System.out.println(i + "\n" + j);
        }

        int i=5, j=2;



        if (i * j >= 10){
            i++;
            j--;
            int r = i * j;
            System.out.println(r + r);
        }
        else {
            int r = ++i * --j;
            System.out.println(r);
        }

        System.out.println(i + "\n" + j);





    }
}
