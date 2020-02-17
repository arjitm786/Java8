package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities(){
        return StudentDataBase.getAllStudents().stream()//Stream<Student>
                .map(Student::getActivities)//Stream<List<String>>
                .flatMap(List::stream)//Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static long getStudentActivitiesCount(){
        return StudentDataBase.getAllStudents().stream()//Stream<Student>
                .map(Student::getActivities)//Stream<List<String>>
                .flatMap(List::stream)//Stream<String>
                .distinct()//Stream<String> -> distinct operation performed on top of it
                .count();
    }

    public static void main(String[] args) {
        System.out.println("List of activities : "+printStudentActivities());
        System.out.println("Count of activities : "+getStudentActivitiesCount());
    }
}
