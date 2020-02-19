package optional;

import data.Bike;
import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {
    //filter
    public static void  optionalFilter(){
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        studentOptional
                .filter(student -> student.getGpa()>=3.5)
                .ifPresent(System.out::println);
    }

    //Map
    public static void optionalMap(){
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());
        studentOptional
                .filter(student -> student.getGpa()>=3.5)
                .map(Student::getName)
                .ifPresent(System.out::println);
    }

    //flatMap
    public static void optionalFlatMap(){
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        Optional<String> bikeName = studentOptional.filter(student -> student.getGpa()>=3.5)
                .flatMap(Student::getBike)
                .map(Bike::getName);
        bikeName.ifPresent(System.out::println);
    }


    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
