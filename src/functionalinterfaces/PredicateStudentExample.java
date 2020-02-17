package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample{

    static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
    static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;
    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void filterStudentByGradeLevel(){
        System.out.println("\nFilter student by Grade Level");
        studentList.forEach(student -> {
            if(p1.test(student)){
                System.out.println(student);
            }
        });
    }

    public static  void filterStudentByGpa(){
        System.out.println("\nFilter student by Gpa");
        studentList.forEach(student ->{
            if(p2.test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudentsByGradeLevelAndGpa(){
        System.out.println("\nFilter student by gpa and grade levelS");
        studentList.forEach(student -> {
            if(p1.or(p2).negate().test(student)){
                System.out.println(student);
            }
            else{
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGpa();
        filterStudentsByGradeLevelAndGpa();
    }
}
