package streamsterminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMappingExample {


    public static void main(String[] args) {
        List<String> namesList = StudentDataBase.getAllStudents().stream()
            .collect(Collectors.mapping(Student::getName,Collectors.toList()));
        System.out.println("nameList : "+namesList);

        Set<String> namesSet = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toSet()));
        System.out.println("nameSet : "+namesSet);
    }
}
