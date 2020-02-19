package numericstreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsRangesExample {

    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1,50);
        System.out.println("Ranged count "+intStream.count());
        IntStream.range(1,50).forEach(value -> System.out.print(value+", ") );

        IntStream intStream1 = IntStream.rangeClosed(1,50);
        System.out.println("\nRanged closed count "+intStream1.count());
        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value+", ") );

        LongStream longStream = LongStream.rangeClosed(1,50);
        System.out.println("\nLongStream Ranged closed count "+longStream.count());
        LongStream.rangeClosed(1,50).forEach(value -> System.out.print(value+", ") );

        DoubleStream doubleStream = IntStream.rangeClosed(1,50).asDoubleStream();
        System.out.println("\nDoubleStream Ranged closed count "+doubleStream.count());
        IntStream.rangeClosed(1,50).asDoubleStream().forEach(value -> System.out.print(value+", ") );
    }
}
