package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime : "+localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2018, 03, 25,
                23, 25, 33, 985);
        System.out.println("localDateTime1 : "+localDateTime1);
        LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("localDateTime2 : "+localDateTime2);

        /**
         * Getting the time and date from LocalDateTime instance
         */

        System.out.println("hour : "+localDateTime.getHour());
        System.out.println("minute : "+localDateTime.getMinute());
        System.out.println("dayOfTheMonth : "+localDateTime.getDayOfMonth());
        System.out.println("ChronoField.DAY_OF_MONTH : "+localDateTime.get(ChronoField.DAY_OF_MONTH));

        /**
         * modifying LocalDateTime
         */

        System.out.println("hours+2 : "+localDateTime.plusHours(2));
        System.out.println("days-2 : "+localDateTime.minusDays(2));
        System.out.println("withMonth(12) : "+localDateTime.withMonth(12));

        //converting LocalDate,LocalTime to LocalDateTime and vice versa.
        LocalDate localDate = LocalDate.of(2019,9,25);
        System.out.println("atTime : "+localDate.atTime(23,33));
        LocalTime localTime=LocalTime.of(23,59);
        System.out.println("atDate : "+localTime.atDate(localDate));
        System.out.println("localDate : "+localDateTime.toLocalDate());
        System.out.println("localTime : "+localDateTime.toLocalTime());

    }
}
