package day_7;

public class C7LogicalOperators{
    // BOOLEAN LOGICAL OPERATORS(Binary Operators)
    // -------------------------
    // && Boolean AND operator
    // || Boolean OR operator
    // !  Boolean INVERT/NOT operator
    // Note: a Boolean Logical operator can only be applied to the boolean operator
    public static void main(String[]hrs){
        System.out.println(10.5>6);
        System.out.println('n'=='n');
        //System.out.println(false>true); ERROR
        System.out.println(false==false);
        System.out.println("hello"=="hellO");
        //AND
        //&& will evaluate to true if both the conditions on the left and the right side of the
        //&& operator are true or it will evaluate to false
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        //OR
        //|| will evaluate to true only if either one of the conditions is true otherwise
        // || will always evaluate to false
        System.out.println(true||false);

        //Binary operators goes from left to right
        System.out.println(true||false&&true);
        System.out.println(
                true || (true && false) && (6*6==30+6) || true
        ) ;

    }
}
