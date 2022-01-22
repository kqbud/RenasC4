package day_23;

public class C3StaticMethod {

    public static void main(String[] args) {

        Student.play();
        // System.out.println(Student.university);

        Student s1 = new Student();
        Student s2 = new Student();

        // System.out.println(Student.getName()); error : instance method can not be called
        // via class name

        System.out.println(s1.getName());
        System.out.println(s2.getName());

    }
}

class Student {

    private static String university = "Harvard";

    private String name ;
    private  String course ;


    static void play(){

        System.out.println("Student is playing");
    }

    public static String getUniversity(){
        return university ;
    }

    // no entry of instance members inside the static methods

    public  String getName(){

        return name ;
    }
}