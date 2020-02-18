package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static  int findMaxValue(List<Integer> integerList){
        return integerList.stream()
                .reduce(0,(x,y) -> x>y ? x : y);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList){
        return integerList.stream()
                .reduce((x,y) -> x>y ? x : y);
    }

    public static  int findMinValue(List<Integer> integerList) {
        return integerList.stream()
                .reduce(0, (x, y) -> x < y ? x : y);//Default value will hamper result

    }

    public static Optional<Integer> findMinValueOptional(List<Integer> integerList){
        return integerList.stream()
                .reduce((x,y) -> x<y ? x : y);
    }
        public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
//        List<Integer> integerList = new ArrayList<>();

//        System.out.println("Max value is : " +findMaxValue(integerList));
//        Optional<Integer> maxValueOptional = findMaxValueOptional(integerList);
//        System.out.println("Optional max is : "+maxValueOptional);
//        if(maxValueOptional.isPresent())
//            System.out.println("Max value is : " +maxValueOptional.get());
//        else
//            System.out.println("Input list is empty");

       Optional<Integer> minValueOptional = findMinValueOptional(integerList);
            System.out.println("Min value optional : "+minValueOptional);
       if(minValueOptional.isPresent())
            System.out.println("Min value is : "+findMinValueOptional(integerList).get());
       else
           System.out.println("Input list is empty");

    }
}
