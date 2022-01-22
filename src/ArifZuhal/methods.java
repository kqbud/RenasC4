package ArifZuhal;

public class methods {

/*
    public static void main(String[] args) {
        int r2 = power(10,5);
        System.out.println(r2);
    }
    static int power(int a, int b){
        int result = 1;
        for (int i=1; i<=b ; i++){
            System.out.print(result);
        }
        System.out.println();
        return result;

    }

 */
public static void toplama(int a, int b, int c){

    System.out.println("Toplamlari: " + (a+b+c));

}

    public static void toplama (int a, int b){

        System.out.println("Toplamlari: " + (a+b));
    }

    public static void toplama (int a, int b, int c, int d){

        System.out.println("Toplamlari: " + (a+b+c+d));
    }

    public static void main(String[] args) {

        toplama(3,4,5);
        toplama(10,20);
        toplama(10,20,30,40);

    }

}


