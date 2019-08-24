package study.oca.examples.ch_02;

/**
 * => Working with Unary Operators
 *      -> Unary Operators are -, +, ++, --, !;
 */
public class Example02
{
    public void runExample(){
        // -> Logical Complement and Negation Operators
        //      - Logical complement operators, ! , flips the value of a boolean expression.
        boolean x = false;
        boolean y = !x;
        System.out.printf("x=%b %n",x);
        System.out.printf("y=!x => y= %b %n",y);

        // -> Negation operator, - , reverse the sign of a numeric expression.
        double x2= 1.21;
        double y2= -x2;
        System.out.printf("");


    }
}
