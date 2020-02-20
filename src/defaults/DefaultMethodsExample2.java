package defaults;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {

    static Consumer<Student> studentConsumer = (student -> System.out.println(student));
    static Comparator<Student> gradeComparator = Comparator.comparingDouble(Student::getGradeLevel);
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);

    public static void sortByName(List<Student> studentList){
        System.out.println("\nAfter sortByName\n");
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    public static void sortByLeastGpa(List<Student> studentList){
        System.out.println("\nAfter sortByLeastGpa\n");
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    public static void comparatorChaining(List<Student> studentList){
        System.out.println("\nAfter comparatorChaining\n");
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer);
    }
    
    public static  void sortWithNullValues(List<Student> studentList){
        System.out.println("\nAfter sortWithNullValues\n");
        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Before sort\n");
        studentList.forEach(studentConsumer);
        //sortByName(studentList);
        //sortByLeastGpa(studentList);
        //comparatorChaining(studentList);
        sortWithNullValues(studentList);
    }
}
