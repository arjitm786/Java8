package numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsAggregateExample {

    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1,50).sum();
        OptionalInt max = IntStream.rangeClosed(1,50).max();
        OptionalLong min = LongStream.rangeClosed(50,100).min();
        OptionalDouble average = LongStream.rangeClosed(1,50).average();

        System.out.println("Sum is : "+sum);
        System.out.println(max.isPresent());
        System.out.println("Max is : "+max.getAsInt());
        System.out.println("Min is : "+ (min.isPresent() ? min.getAsLong() : 0));
        System.out.println("Average is : "+ (average.isPresent() ? average.getAsDouble() : 0));
    }
}
