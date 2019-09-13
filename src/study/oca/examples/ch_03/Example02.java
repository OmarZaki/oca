package study.oca.examples.ch_03;


/**
 * This Class has exampels for Chapter03.
 * Using String String Builder
 */
public class Example02
{


    public void runExample(){
        System.out.println("Chapter03 | Example 02 | StringBuilder ");
        System.out.println("=========================");
        //// A small program creates a lot of strings very quickly.
        // The following program will creates several String objects most of which are eligble for garbage collection.
        // This is is very inefficient.
        // StringBuilder class create a String without storing all those interim values.
        // example of small method that creates a lot of String Objects.
        String alpha = "";
        for(char current = 'a'; current<='z'; current++ )
            alpha += current;
        System.out.printf("Using String Object= %s   %n", alpha);

        /**
         * StringBuilder is not immutable.
         * StringBuilder returns a reference to itself.
         * Question in the Exam will be about StringBuilder.
         *
          */
        // writing the previous example using StringBuilder.
        StringBuilder alphaStringBuilder = new StringBuilder();
        for(char current ='a'; current <= 'z'; current++)
            alphaStringBuilder.append(current);
        System.out.printf("Using StringBuilder = %s %n",alphaStringBuilder );

        // Mutability & Chaining.
        System.out.printf("=> %s %n","Mutability and Chaining");
        // When chaining String objects, the result will be a new String with answer.
        // Chaining StringBuilder does not work in this way, instead, the StringBuilder changes its own state and returns a reference ot itself.
        // example
        StringBuilder sb = new StringBuilder("Start");
        sb.append("+Middle");
        StringBuilder same = sb.append("+End");
        System.out.printf("same = %s %n", same);
        // In the exam questions are more complicated.
        // What do you think this example prints ?
        StringBuilder a  = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b= b.append("f").append("g");
        System.out.printf("StringBuilder a = %s     %n", a);
        System.out.printf("StringBuilder b = %s     %n", b);

        // Create StringBuilder
        System.out.printf("=> %s %n","Creating StringBuilder");
        // There are three ways to create StringBuilder Object:
        StringBuilder sb1 = new StringBuilder();// initiate an empty StringBuilder.
        StringBuilder sb2 = new StringBuilder("animal"); // StringBuilder which include "animal" as String.
        StringBuilder sb3 = new StringBuilder(10); // create a StringBuilder that has capacity of 10 chars.
        // Size vs Capacity.
        // -> Size is the number of chars currently in the sequence.
        // -> Capacity is the number of chars the sequence can hold.
        // -> Because of String is immutable, String and Capacity are the same.
        // -> For StringBuilder, Java knows that size is more likely to change as the object is used.
        // -> When the StringBuilder is constructed, it may start at the default capacity( which happens to be 16).
        // -> Programmer can choose the capacity. for the following example:
        StringBuilder sb4 = new StringBuilder(10); // in this case Size is 0 for sb4 because it contains no strings, but the capacity is 10 chars
        System.out.printf("Size = %d    %n",sb4.length());
        System.out.printf("Capacity = %d    %n",sb4.capacity());
        // -> if the capacity is not enough, Java automatically increased it for us.
        sb4.append("123456789123");
        System.out.printf("Size = %d    %n",sb4.length());
        System.out.printf("Capacity = %d    %n",sb4.capacity());

        // Important StringBuilder Methods
        System.out.printf("=> %s %n","Important StringBuilder Methods");
        // -> charAt(), indexOf(), length(), and substring() these four methods works the same as String class.
        // -> substring() return a String not a StringBuilder.

        // append()
        // -> The most popular method used for StringBuilder .
        // -> append can be called for boolean, int, String or Char.
        System.out.printf(" ->append() %n");
        StringBuilder sb6= new StringBuilder().append(1).append('a');
        sb6.append(" - ").append(true);

        // insert()
        System.out.printf(" ->insert() %n");
        // -> Adds char to the StringBuilder at the requested index and return a reference of StringBuilder object.
        // -> examples:
        StringBuilder sb7 = new StringBuilder("animals");
        sb.insert(7, "-");
        sb.insert(0, "-");
        sb.insert(4, "-");
        System.out.printf("after calling insert() in StringBuilder(\"animals\") = %s ", sb);

        // delete() & deleteCharAt()
        System.out.printf(" ->delete() and deleteCharAt() %n");
        // -> delete remove chars from a the sequence and returns a reference to the current StringBuilder.
        // -> deleteCharAt delete a only one char.
        // -> example:
        StringBuilder sb8 = new StringBuilder("abcdef");
        sb.delete(1, 3); // sb = adef
        //sb.deleteCharAt(5); // throws an exception

        // reverse()
        System.out.printf(" ->reverse() %n");
        // -> it reverse the chars in the sequences and returns a reference to the current StringBuilder.
        StringBuilder sb9 = new StringBuilder("ABC");
        sb.reverse();
        System.out.println(sb);

        // toString()
        System.out.printf(" ->toString() and deleteCharAt() %n");

    }

    
}
