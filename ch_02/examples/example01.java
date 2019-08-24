/**
 * Numeric Promotion examples.
 */
public class example01 {

    public static void main(String [] args) {
        // Numeric Promotion
        /**
         * Example 01
         * what is the data type of x*y ?
          */
        //
        int x = 1;
        long y = 33;
        System.out.printf("int (%d) * int (%d)  =(int) %d %n",x, y, x*y ); // the result will be in long
        //
        /**
         * Example 02
         * What is the data type of x1 + y1 ?
         */
        double x1 = 39.21;
        float y1 = 2.1f; // float will be assumed as double unless using f with value //=> the code does not compile without adding f.
        System.out.printf("double (%f) + float (%f) = double (%f)  %n",x1,y1, x1 + y1); // the data type for this opeartion would be double.

        // Exmaple 03
        /**
         * What is the data type of x2 / y2 ?
         */
        short x2= 10;
        short y2= 3;
        System.out.printf("short (%d) / short (%d) = int (%d) %n",  x2, y2, x2/y2); // the data type for result is int.

        // Example 04
        /**
         * What is the data type of x3 * y3 / z3 ?
         */
        short x3=14; // short => int => float
        float y3=13;
        double z3=30;
        System.out.printf("short (%d) * float (%f) / double (%f) = double (%f) %n ",x3,y3,z3, x3*y3/z3);


    }
}
