package day_18;

public class C4MethodsDemo {
    //public and static are modifiers
    //public: access modifier
    //static: non-access modifier
    //void: return type
    //main: name of the method
    //String[]:argument type or parameter type ; args is a variable of String[] type
    //{}: body of the method
    public static void main(String[] args) {

    }
    // a method can exist without a modifier. a method can declare another method
    //below method only have return type and method name
    void display() {
        return; // returning statement without a returning value ; OPTIONAL
    }
    //static is modifier, int is return type, getSalaray is method name
    static int getSalary(int days_worked){
        System.out.print(days_worked);
        return 100000000;
    }

}
