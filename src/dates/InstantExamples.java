package dates;

import java.time.Duration;
import java.time.Instant;

public class InstantExamples {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println("getEpochSecond : "+instant.getEpochSecond());
        System.out.println(Instant.ofEpochSecond(0));
        Instant instant1 = Instant.now();
        Duration duration = Duration.between(instant, instant1);
        System.out.println("durationInNanoSeconds : "+duration.getNano());
    }
}
