package day_9;

public class C2SwitchRevision {
    public static void main(String[] lala) {
        String option = "fourth";
        switch (option) {
            case "first":
                    System.out.println("Hello");
            case "second":
                System.out.println("slav");
            case "third":
                System.out.println("chao"); break;
            case "fourth":
                int op=2;
                switch(op){
                    case 1:
                        System.out.println("play");
                    case 2:
                        System.out.println("Study");
                        break;
                    case 3:
                        System.out.println("sleep");
            }
        }
    }
}