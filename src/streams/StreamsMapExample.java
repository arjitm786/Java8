package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static List<String> namesList(){
        return StudentDataBase.getAllStudents().stream()//Stream<Student>
                //Student as an input -> Student name
                .map(Student::getName)//Stream<String>
                .map(String::toUpperCase)//Stream<String> -. performs uppercase operation on each input
                .collect(Collectors.toList());
    }

    public static Set<String> namesSet(){
        return StudentDataBase.getAllStudents().stream()//Stream<Student>
                //Student as an input -> Student name
                .map(Student::getName)//Stream<String>
                .map(String::toUpperCase)//Stream<String> -. performs uppercase operation on each input
                .collect(Collectors.toSet());
    }
    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println(namesSet());
    }
}
