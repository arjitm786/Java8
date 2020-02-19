package optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {

        Optional<String> optional=Optional.ofNullable("Hello Optional");

        //isPresent
        System.out.println(optional.isPresent());

        //ifPresent
        optional.ifPresent(System.out::println);
    }
}
