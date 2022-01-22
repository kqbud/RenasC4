package day_23;

public class C7InstanceStatic {
    public static void main(String[] args) {
        Foo.husky();
        System.out.println(Foo.bunny());
        new Foo().meta();

        Foo f = new Foo();
        f.meta();

    }
}

class Foo{

    static void husky(){
        System.out.println("gruff gruff!");
    }

    static String bunny(){
        return "Hello";
    }

    void meta(){
        System.out.println("Hi");
    }
}
