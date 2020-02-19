package streamsterminal;

import data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsCountingExamples {

    public static long count(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .collect(Collectors.counting());
    }

    public static void main(String[] args) {
        System.out.println(count());
    }
}
