package dates;

import java.time.*;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime : "+zonedDateTime);
        System.out.println("zonedOffset : "+zonedDateTime.getOffset());
        System.out.println("zonedId : "+zonedDateTime.getZone());
//        System.out.println("Available zones : "+ZoneId.getAvailableZoneIds());
//        ZoneId.getAvailableZoneIds().forEach((zone) -> System.out.println(zone));
        System.out.println("number of zones : "+ ZoneId.getAvailableZoneIds().size());
        System.out.println("India IST : "+ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));

        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Kolkata : "+localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.now(Clock.system(ZoneId.of("Asia/Kolkata")));
        System.out.println("Kolkata (using clock) : "+localDateTime);

        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println("ofInstant : "+localDateTime2);

        /**
         * Convert from localDateTime, instant to ZonedLocalDate and ZonedLocalTime
         */

        LocalDateTime localDateTime3 = LocalDateTime.now();
        System.out.println("localDateTime3 : "+localDateTime3);
        ZonedDateTime zonedDateTime1 = localDateTime3.atZone(ZoneId.of("Asia/Kolkata"));
        System.out.println("zonedDateTime1 : "+ zonedDateTime1);
        ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.of("Asia/Kolkata"));
        System.out.println("zonedDateTime2 : "+zonedDateTime2);
        OffsetDateTime offsetDateTime = localDateTime3.atOffset(ZoneOffset.ofHours(+5));
        System.out.println("offsetDateTime : "+offsetDateTime);

    }

}
