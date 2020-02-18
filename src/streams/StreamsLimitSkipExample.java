package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integers){
        return integers.stream()
                .limit(2)//Process first two element from stream and discard rest.
                .reduce((x,y)->x+y);
    }

    public static Optional<Integer> skip(List<Integer> integers){
        return integers.stream()
                .skip(3)//Skip first 3 elements from stream and process rest.
                .reduce((x,y)->x+y);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6,7,8,9,10);
        Optional<Integer> limitResult = limit(integers);
        if(limitResult.isPresent())
            System.out.println("Limit result is : "+limitResult.get());
        else
            System.out.println("No input is passed");

        Optional<Integer> skipResult = skip(integers);
        if(skipResult.isPresent())
            System.out.println("Skip result is : "+skipResult.get());
        else
            System.out.println("No input is passed");
    }
}
