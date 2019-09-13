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

        /*
         *  => Important String Methods
         */
        System.out.printf(" %s \n %s \n", "Important String Methods","========================");
         //  -> lenght() : it return the number of chars in the String.
        String string = "animals";
        System.out.printf("lentth() method will return for %s = %d %n", string,string.length());

        // => charAt(): let you query the string to find out what character is at a specific index.
        String string2= "animals"; // the index starts from 0
        System.out.println(string2.charAt(0)); // this will return 0
        System.out.println(string2.charAt(6)); // this will return s
        //System.out.println(string2.charAt(7)); // throws exception it throws java.lang.StringIndexOutOfBoundsException

        // => indexOf() it return the first inndex of the matched char, it works with one char or whole string as input. it can start from requested position.
        // The following examples shows how it works:
        String string3 = "animals";
        System.out.println(string3.indexOf('a')); // it will return 0
        System.out.println(string3.indexOf("al"));// it will return
        System.out.println(string3.indexOf("a",4));
        System.out.println(string3.indexOf("al",5)); // the method does not throw an exception if the match does not found. it returns -1;

        // => substring() : The method looks for a chars in string. It returns parrts of the string. The first parameter is the index to start with for the returned string. as usual this is a zero-based index.
        // There is an optional second parameter, which is the end index you want to stop at.
        // Is the hardest one in the exam.
        // beginIndex : start from it, it is included.
        // endIndex: stop at it. It will not be included.
        // Examples here:
        String string4 = "animals";
        System.out.println(string4.substring(3)); // return mals
        System.out.println(string4.substring(string4.indexOf('m'))); // return mals
        System.out.println(string4.substring(3,4)); // index 4 will not be included, it returns m
        System.out.println(string4.substring(3,7)); // 7 is like saying that end of the string it will stop on it. so it will included the inded 7-1 which is the "s" end of the string.
        System.out.println(string4.substring(3,3)); // return empty string
//        System.out.println(string4.substring(3,2)); // throw exception
//        System.out.println(string4.substring(3,8)); // throw exception

        // => toLowerCase() and toUpperCase() Convert every lower char to upper char and vice versa.
        // It has no effect on numbers.
        // examples:
        String string5 = "animals";
        System.out.println(string5.toUpperCase());
        System.out.println("Abc123".toLowerCase());

        // => startsWith() and endsWith()
        // => equals() and equalsIgnoreCase():
        // equals() checks whether two String objects contains exactly the same chars in the same order.
        // equalsIgnoreCase() checks whether two String objects contains the same chars with the exception whtat it will convert the chars in needed.
        // it return boolean.
        // examples:
        System.out.println("abc".equals("ABC")); // return false.
        System.out.println("ABC".equals("ABC")); // return true.
        System.out.println("abc".equalsIgnoreCase("ABC")); // return true.

        // => startsWith() and endsWith() it checks if the string starts/ends with a provided string, it return boolean.
        // examples:
        System.out.println("abc".startsWith("a")); // true
        System.out.println("Abc".startsWith("a")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abs".endsWith("c")); // false

        // => contains(): looks for matches in the String. The match can be anywhere in the String.
        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false
        System.out.println("abc".indexOf('a') != -1 ); // cantains() method can be used instead of this.

        // => replace() : does a simple search and replace one the string.
        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("ab", "A")); // AcAc

        // => trim() it removes the white spaces from the beginning and end of the string.
        // Whitespaces consists of spaces, \t (tab) ,\n (newline) and \r.
        System.out.println("abc".trim()); // abc
        System.out.println("\t   a b c \n \r ".trim());

        // Method Chaining
        System.out.printf(" %s \n %s  \n", "Method Chaining","========================");


    }

}
