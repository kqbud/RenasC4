package day_21;

public class C4Object {
    //non-static or instance variable
    //OR attribute OR instance data member OR instance data field OR instance data
    //non-static data OR object data OR data inside the object
    //an instance variable is associated with the object
    //an instance variable represents the property OR state of the object
    int j = 50;
    //static variable OR static data member OR static field
    //a static variable is not associated with the object
    static String name = "Tom";

    public static void main(String[] args) {
        /*
        instance can mean an object
        instance can also mean a non-static thing
        instance things(methods and variables are associated with the instance or object)
         */
        // a local variable takes memory inside the stack area
        int c = 1;
    }
    //a static method is not associated with the object
    static void show(){}

    //non-static or instance method is associated with the instance
    void play(){}
    // a non-static or an instance method represents the behaviour
    //or functionality of the object
    // also called an instance
}
