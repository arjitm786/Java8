package functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static BinaryOperator<Integer> binaryOperator = (a,b) -> a*b ;

    static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);

    static BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);

    static BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);

    public static void main(String[] args) {
        System.out.println(binaryOperator.apply(3,4));
        System.out.println("\nResult of maxBy is : "+maxBy.apply(4,5));
        System.out.println("\nResult of minBy is : "+minBy.apply(4,5));
    }
}
