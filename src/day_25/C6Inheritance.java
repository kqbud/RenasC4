package day_25;

public class C6Inheritance {
    public static void main(String[] args) {
        Child2 c=new Child2();
        System.out.println(c.i + c.j+ c.k);
    }
}

class Baba1 extends Dede1{
int j =10;
}

class Child2 extends Baba1{
    int k=20;
}

class Dede1{
int i = 5;
}
