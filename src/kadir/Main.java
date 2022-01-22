package ForAdem;

public class Main {
    public static void main(String[] args) {
        Bird[] arr = new Bird[3];
        arr[0] = new Bird("Boncuk", "yellow", 1);
        arr[1] = new Cat("Ash", "gray", 2);
        arr[2] = new Dog("Golden", "gold", 4);

        for (Bird eachBird : arr) {
            System.out.println(eachBird.toString());
        }
        System.out.println();

    }


}
