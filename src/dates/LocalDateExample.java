package dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        System.out.println("localDate : " + localDate);

        LocalDate localDate1 = LocalDate.of(2018, 07, 17);
        System.out.println("localDate1 : "+localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2016, 358);
        System.out.println("localDate2 : "+localDate2);

        /**
         * Get values from localDate
         */
        System.out.println("getMonth : "+localDate.getMonth());
        System.out.println("getMonthValue : "+localDate.getMonthValue());
        System.out.println("getDayOfWeek : "+localDate.getDayOfWeek());
        System.out.println("getDayOfYear : "+localDate.getDayOfYear());
        System.out.println("getDayOfMonth  : "+localDate.getDayOfMonth());
        System.out.println("dayOfMonth using get(ChronoField) : "+localDate.get(ChronoField.DAY_OF_MONTH));

        /**
         * Modifying Local Date
         */

        System.out.println("plusDays : "+localDate.plusDays(2));
        System.out.println("plusMonths : "+localDate.plusMonths(2));
        System.out.println("minusDates : "+localDate.minusDays(2));
        System.out.println("withYear : "+localDate.withYear(2019));
        System.out.println("with(ChronoField) : "+localDate.with(ChronoField.YEAR,2021));
        System.out.println("with(TemporalAdjusters) : "+localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println("ChronoUnit.MINUS : "+localDate.minus(1, ChronoUnit.YEARS));

        /**
         * Unsupported
         */
//        System.out.println("ChronoUnit.MINUS : "+localDate.minus(1, ChronoUnit.MINUTES));
        System.out.println("isSupported : "+localDate.isSupported(ChronoUnit.MINUTES));

        /**
         * Additional Support method
         */
        System.out.println("isLeapYear : "+localDate.isLeapYear());
        System.out.println("isLeapYear : "+LocalDate.ofYearDay(2023,1).isLeapYear());
        System.out.println("localDate isEqual to localDate2 ? "+localDate.isEqual(localDate1));
        System.out.println("localDate isBefore to localDate2 ? "+localDate.isBefore(localDate1));
        System.out.println("localDate isAfter to localDate2 ? "+localDate.isAfter(localDate1));
    }
}
