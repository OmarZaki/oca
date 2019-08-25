package study.oca.examples.ch_03;

/**
 * This first class examples for chapter 3 of Study Guide
 * Core Java APIs
 * Using Operators and Decision Constructs
 */
public class Example01
{

    public void runExample(){

        // =>  Creating and Manipulating Strings
        /**
         * -> The is such a fundamental class that you'' be hard-pressed to write code without it.
         * -> String is a Reference , it is not required to be initiated with "new";
         */
        String name1 = "Fluffy";
        String name2 = new String("Fluffy");

        // -> Concatenation: is placing a String before another String and combining them together is called string concatenation.
        /**
         * The Rules for String concatenation are :
         * 1-> If both operatnds are numeric, + means numeric addition.
         * 2-> If either operand is a String, + means concatenation.
         * 3-> The expression is evaluated left to right.
         * Here and examples:
         */
        System.out.println(2 +2); // 4
        System.out.println("a" + "b"); // ab
        System.out.println("a"+ "b" + 3);
        System.out.println(1+ 2 + "c"); // 3c evaluation from left to right.  1+2 = 3 => 3 + "c" = 3c
        // => Immutability : Once the String is created, it is not allowed to change. It cannot be made larger or smaller, and you can't change one char inside it.
        /**
         * -> Mutable is another word for changeable, Immutable is the opposite. an object can't be change once its created.
         * -> String is Immutable.
         * -> Mutable class has setter, while Immutable does not have setter.
         * -> Also, immutable classes in java are final, and subclasses can't add mutable behaviour.
         * -> Also concat function is used to String concatenation.
         *
         */
        String s1= "1";
        String s2= s1.concat("2");
        s2.concat("3"); // String is Immutable , concat() can't change it.
        System.out.println(s2); // result 12

        // => The String Pool known as the intern Pool, is a location in the JVM that collects all these strings.
        /**
         * -> it cantains literal values that appear in your program, For example, "name" is literal and therefore goes into the string pool.
         * -> String objects does not go String Pool, only string literals. String Objects is Garbage collected.
         */
        String name = "omar"; // it uses string pool.
        String name3= new String("Xxxx"); // it does not use string pool.

        // => Important String Methods
        /**
         *  -> lenght() : it return the number of chars in the String.
         */
        String string = "animals";
        System.out.printf("lentth() method will return for %s = %d %n", string,string.length());

        // => charAt(): let you query the string to find out what character is at a specific index.
        // => indexOf();
        // => substring()
        // => toLowerCase() and toUpperCase()
        // => equals() and equalsIgnoreCase();
        // => startsWith() and endsWith()
        // => contains()
        // => replace()
        // => trim()




    }

}
