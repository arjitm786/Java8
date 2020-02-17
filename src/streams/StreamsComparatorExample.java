package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static List<Student> sortStudentsByStudentName(){
       return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsByStudentGpa(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsByStudentGpaReversed(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Students sorted by name : ");
        sortStudentsByStudentName().forEach(System.out::println);
        System.out.println("Students sorted by gpa ascending : ");
        sortStudentsByStudentGpa().forEach(System.out::println);
        System.out.println("Students sorted by gpa ascending : ");
        sortStudentsByStudentGpaReversed().forEach(System.out::println);
    }
}
