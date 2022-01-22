package day_19;

public class C1MethodDemo {
    public static void main(String[]aq){
        //{       method signature  }
        show("kqBud",65);//actual arguments
        show();
        show("jerry",75);//actual arguments
    }
    /*
    when two or more methods have the same name, this is called method overloading
     */
    static void show(String name, int salary){//formal arguments
        System.out.println(name + "\t" + salary);
    }
    static void show(){//area between parenthesis is called arguments

        System.out.println("no arguments show method");
    }
}
