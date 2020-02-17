package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    public static List<Student> filterStudent(){
        return StudentDataBase.getAllStudents().stream()//Stream<Student>
        .filter((student -> student.getGender().equals("female")))//Stream<Student> with gender female
        .filter(student -> student.getGpa()>=3.9)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        //System.out.println(filterStudent());
        filterStudent().forEach(System.out::println);
    }
}
