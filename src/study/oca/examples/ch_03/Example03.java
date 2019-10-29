package study.oca.examples.ch_03;

/**
 * Understanding Equality.
 */
public class Example03
{
    public void runExample()
    {
        System.out.println("Chapter03 | Example 03 | Understanding Equality ");
        System.out.println("=========================");
        //-> == is used to compare numbers and that about object reference.

        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");
        System.out.println(one == two); // false
        System.out.println(one == three); // true

        // -> String equality, made so in part because of the way the JVM reuses String literals.
        String x = "Hello World";
        String y = "Hello World";
        System.out.println(x == y); // true

        String x2 = "Hello World";
        String z2 = " Hello World".trim();
        System.out.println(x2 == z2); // false


        String x3 = new String("Hello World");
        String y3 = "Hello World";
        System.out.println(x3 == y3); // false

        // -> never use == to compare String objects. The only time you should have to deal with == for Strings is on the exam.

    }
}
