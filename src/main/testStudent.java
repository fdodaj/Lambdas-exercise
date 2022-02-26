package main;

import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class testStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Florian", "Dodaj", 16, " first year ", 5));
        students.add(new Student("Peter", "Smith", 13, " second year ", 4));

        passClass(students, Student::passesClass);
        failClass(students, Student::passesClass);

    }
    private static  void passClass(List<Student> students, Predicate<Student> predicate){
        for (Student student: students){
            if (predicate.test(student))
                System.out.println(student.getName() + " " + student.getSurname() + " passes " + student.getYear() + " class " );
        }
    }
    private static  void failClass(List<Student> students, Predicate<Student> predicate){
        for (Student student: students){
            if (! predicate.test(student))
                System.out.println(student.getName() + " " + student.getSurname() + " failed " + student.getYear() + " class " );
        }
    }

}

