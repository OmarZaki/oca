package study.oca.examples.ch_03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * Working with dates and times
 *
 */
public class Example05
{

    public void runExample(){
        // three types of examples are requires for Date and Times for Java 8.
        // LocalDate -> only date .
        // LocalDate -> only time.
        // LocateDateTime -> date and time. but no zones

        // static function of
        // no constructors are available.
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        // of functions;
        LocalDate date1 = LocalDate.of(2020,1,20);
        LocalDate date2 = LocalDate.of(2020, Month.JANUARY,20);

        LocalTime time1= LocalTime.of(20,20);
        LocalTime time2= LocalTime.of(20,20,30);
        LocalTime time3= LocalTime.of(20,20,30,393);

        LocalDateTime dateTime1 = LocalDateTime.of(2020,Month.FEBRUARY,20,15,30,20,232);
        LocalDateTime dateTime2 = LocalDateTime.of(date1,time1);

        // print dates and times
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        // Manipulating dates
        date.minusDays(1);
        date.plusDays(1);

        date.minusMonths(3);
        date.plusMonths(3);

        date.minusWeeks(2);
        date.plusWeeks(2);

        date.minusYears(1);
        date.plusYears(1);

        // Manipulating times
        time.minusNanos(1);
        time.plusNanos(1);

        time.minusSeconds(1);
        time.plusSeconds(1);

        time.minusMinutes(1);
        time.plusMinutes(1);

        time.minusHours(1);
        time.plusHours(1);

        // Manipulating DateTime is the same as date and time.
        // Date and time classes are immutable .. so be attention when changing them to be assigned to another object.

        // working with Period.
    }
}
