package day_24;

public class Notes {
}
/*
Before a Java program runs, the class is first loaded in the JVM's memory. And when the class is loaded,
 static control flow works i.e. a Java program starts with a static control flow.
In between the Static control flow, if any object is created,
then immediately the program switches to the Instance control flow and finishes it and then returns back
 to the static control flow from where it had left. Each time an object is created, the control runs the Instance control flow.

NOTE: A java program starts with the static control flow but
 Instance control flow runs each and every time an object of that class is created.

STATIC CONTROL FLOW
-------------------
Following steps are ececuted in the sequence
1) All the static blocks(or static initializers) and static variables are executed and loaded in the sequence in which
 they are declared in the class i.e. from top to bottom.
   The step one happens only once during the lifecycle of the program i.e. at the time of class loading.
2) main i.e. public static void main(String[]) method is executed

INSTANCE CONTROL FLOW
---------------------
1) All the Init blocks (OR Instance block OR Instance Initialization block) of that class are executed from top to bottom.
2) Constructors are executed
 */