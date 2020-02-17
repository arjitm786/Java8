package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SteamsExamples {

    public static void main(String[] args) {

        //student names and their activities in a map

        Predicate<Student> studentPredicate = student -> student.getGradeLevel() >= 3;
        Predicate<Student> studentGpaPredicate = student -> student.getGpa() >= 3.9;
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .peek((student -> {
                    System.out.println(student);
                }))
                .filter(studentPredicate)
                .peek((student -> {
                    System.out.println("After 1st filter : "+student);
                }))
                .filter(studentGpaPredicate)
                .peek((student -> {
                    System.out.println("After 2nd filter : "+student);
                }))
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println(studentMap);
    }
}
