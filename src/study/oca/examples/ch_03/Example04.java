package study.oca.examples.ch_03;

import com.sun.javafx.binding.StringFormatter;

/**
 * Understanding Java Arrays
 */
public class Example04
{
    public void runExample(){
        // StringBuilder has been implemeted using an array of characters
        // You can create a n array of Primitives or Objects

        // Create an array
        int [] numbers1 = new int[3];

        // Specify the array elements
        int[] numbers2 = new int[]{33,55, 99};

        // It can be initialized by using the the following expression
        // This approach is called defining anonymous array, since its not the size and the type is not specified on the right side.
        int[] numbers3 = {33,44,55};

        // typing [] before and after the name.
        // adding space is optional
        int[] numAnimals;
        int [] numAnimals2;
        int numAnimals3[];
        int numAnimals4 [];

        // Multiple arrays in Declarations
        int [] ids, types; // defines two int arrays.
        int ids2[], types2;  // define an array and another int variable types2;

        // Creating n array with Reference Variables.

        String [] bugs= {"cricket", "beetle", "ladybug"};
        String [] alias= bugs;

        //
        System.out.print(java.util.Arrays.toString((bugs)));



    }
}
