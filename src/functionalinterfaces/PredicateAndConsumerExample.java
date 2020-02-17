package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
    Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;

    BiPredicate<Integer,Double> biPredicate = (gradeLevel,gpa)-> gradeLevel>=3 && gpa>=3.9;

    BiConsumer<String, List<String>> studentBiConsumer =
        (name,activities) -> System.out.println(name +" : "+ activities);

    Consumer<Student> studentConsumer = (student -> {
        if(p1.and(p2).test(student)){
            studentBiConsumer.accept(student.getName(),student.getActivities());
        }
    });

    Consumer<Student> studentConsumer1 = (student -> {
        if(biPredicate.test(student.getGradeLevel(),student.getGpa())){
            studentBiConsumer.accept(student.getName(),student.getActivities());
        }
    });

    public void printNameAndActivities(List<Student> students){
        System.out.println("With two predicates");
        students.forEach(studentConsumer);
    }

    public void printNameAndActivities1(List<Student> students){
        System.out.println("\nWith BiPredicate");
        students.forEach(studentConsumer1);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
       new PredicateAndConsumerExample().printNameAndActivities(studentList);
       new PredicateAndConsumerExample().printNameAndActivities1(studentList);
    }
}
