package numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {

    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,10)//int stream of 10 elements
                //int
                .boxed()
                //Integer
                .collect(Collectors.toList());

    }

    public static int unBoxing(List<Integer> integerList){
        //wrapper to primitive
        return integerList.stream()
                //Wrapper Integer values
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {

        List<Integer> integerList = boxing();
        System.out.println("Boxing : "+integerList);
        System.out.println("unboxing : "+unBoxing(integerList));

    }
}
