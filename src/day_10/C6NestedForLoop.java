package day_10;

public class C6NestedForLoop {
    public static void main(String[] args) {


                int i, j ;

                for(i=543210; i>0; i-- ){
                    j= i/10;
                    i=j;
                    if(j==0){
                        break;
                    }


                    System.out.println(j);
                }
            }
        }



