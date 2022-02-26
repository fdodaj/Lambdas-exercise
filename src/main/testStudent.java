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

    }
}

