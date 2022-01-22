package day_26;

public class C5Inheritance {
    public static void main(String[] args) {
        Child1 c = new Child1();
       // c.show();

        // super and this keyword are not allowed in the static method
        //super.show();
        c.showA();
    }

}

class Base1{
    int a = 10;
    void show(){
        System.out.println("hello");
    }
}


class Child1 extends Base1{
    int a = 20;
    void showA(){
        int a = 30;
        System.out.println(a);// this gives to the priority to the local variablee
        System.out.println(this.a);//access to the instance variable
        System.out.println(super.a);//super calss's variable a
    }

    void show() {
        System.out.println("hi"); super.show();
    }


}
