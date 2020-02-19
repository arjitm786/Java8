package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    //orElse
    public static String optionalOrElse(){
        Optional<Student> studentOptional = Optional.empty();
//        studentOptional= Optional.ofNullable(StudentDataBase.studentSupplier.get());
        return studentOptional.map(Student::getName).orElse("Default");
    }

    //orElseGet
    public static String optionalOrElseGet(){
        Optional<Student> studentOptional = Optional.empty();
        studentOptional= Optional.ofNullable(StudentDataBase.studentSupplier.get());
        return studentOptional.map(Student::getName).orElseGet(()->"Default");
    }

    //orElseThrow
    public static String optionalOrElseThrow(){
        Optional<Student> studentOptional = Optional.empty();
//        studentOptional= Optional.ofNullable(StudentDataBase.studentSupplier.get());
        return studentOptional.map(Student::getName).orElseThrow(()->new RuntimeException("No data available"));
    }


    public static void main(String[] args) {
        System.out.println("orElse : "+optionalOrElse());
        System.out.println("orElseGet : "+optionalOrElseGet());
        System.out.println("orElseThrow : "+optionalOrElseThrow());
    }
}
