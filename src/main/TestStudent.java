package main;

import model.Person;
import model.Student;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;


public class TestStudent {
    public final static Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {


        TestStudent ts = new TestStudent();
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Florian", "Dodaj", 16, " first year ", 10));
        students.add(new Student("Peter", "Smith", 13, " second year ", 4));
        students.add(new Student("John", "Lleshi", 19, " second year ", 6));
        students.add(new Student("Stuart", "Mark", 15, " second year ", 9));
        // 700 students;

        List<Student> passedStudents = students.stream().filter(s -> s.getGrade() >= 5).collect(Collectors.toList());
        passedStudents.forEach( student -> System.out.println(student.getName()+ " " + student.getSurname() + " passed" + student.getYear()));


        Supplier studentSupplier = () -> students.add(new Student("Test", "Test", 16, " first year ", 10));
        studentSupplier.get();


        bestStudents(students, (Student a) -> System.out.println(a.getName() + " performed great this season with a grade of " + a.getGrade()));

        ts.failClass(students, a -> a.getGrade()<=4);

    }
    private void failClass(List<Student> students, Predicate<Student> predicate){
        for (Student student: students){
            if (predicate.test(student))
                System.out.println(student.getName() + " " + student.getSurname() + " failed " + student.getYear() + " with a grade of " + student.getGrade() );
        }
    }

    static void bestStudents(List<Student> students, Consumer<Student> consumer) {
        for (Student student : students) {
            if (student.getGrade()>=9){
                consumer.accept(student);
            }
        }
    }
}

