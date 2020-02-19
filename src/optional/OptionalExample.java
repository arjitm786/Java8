package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName(){
        Student student = null;
//        student=StudentDataBase.studentSupplier.get();
        if(student!=null){
            return student.getName();
        }
        return null;
    }

    public static Optional<String> getStudentNameOptional(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(studentOptional.isPresent()) {
            //return studentOptional.map(Student::getName);//Optional<String>
            return Optional.empty();
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
//        String name = getStudentName();
//        if(name!=null)
//            System.out.println("Length of the student name : "+name.length());
//        else
//            System.out.println("Student not found.");

        Optional<String> studentOptional = getStudentNameOptional();
        if (studentOptional.isPresent())
            System.out.println("Length of the student name : "+
                    studentOptional.get().length());//String.
        else
            System.out.println("Student not found.");

    }
}
