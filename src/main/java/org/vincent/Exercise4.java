package org.vincent;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Exercise4 {
    public static void calculateDateDifference(String dateBefore, String dateAfter){
        LocalDate dateBeforeConverted = LocalDate.parse(dateBefore, DateTimeFormatter.ISO_DATE);
        LocalDate dateAfterConverted = LocalDate.parse(dateAfter, DateTimeFormatter.ISO_DATE);
        long dayDiff = (ChronoUnit.DAYS.between(dateBeforeConverted,dateAfterConverted));

        System.out.println("Exercise 4: " +
                "\n" + "date1 = " + dateBefore +
                "\n" + "date2 = " + dateAfter +
                "\n" + "day difference = " + dayDiff +
                "\n"
        );
    }
}
