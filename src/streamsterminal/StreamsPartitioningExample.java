package streamsterminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamsPartitioningExample {

    public static  void partitioningBy1(){
        Predicate<Student> studentGpaPredicate = student -> student.getGpa()>=3.8;
        Map<Boolean, List<Student>> partitioningMap =StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(studentGpaPredicate));
        System.out.println("Partitioning map : "+partitioningMap);
    }

    public static  void partitioningBy2(){
        Predicate<Student> studentGpaPredicate = student -> student.getGpa()>=3.8;
        Map<Boolean, Set<Student>> partitioningMap =StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(studentGpaPredicate,
                        toSet()));
        System.out.println("Partitioning map : "+partitioningMap);
    }

    public static void main(String[] args) {
//        partitioningBy1();
        partitioningBy2();
    }
}
