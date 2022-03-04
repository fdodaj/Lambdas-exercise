package main;

import model.Person;
import model.Student;

public class Test {
    public static void main(String[] args) {
        System.out.println(Student.counter); //0

        Student test = new Student();
        System.out.println(Student.counter);    //1
        System.out.println(test.count);         //1

        Student test2 = new Student();
        System.out.println(Student.counter);    //2
        System.out.println(test.count);         //1
    }
}
