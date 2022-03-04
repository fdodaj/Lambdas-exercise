package main;

import model.Student;

public class Test {
    public static void main(String[] args) {
        System.out.println(Student.counter);  //0

        Student test = new Student();
        System.out.println(Student.counter);   //1
        System.out.println(test.count);     //1
        Student test1 = new Student();
        System.out.println(test1.counter);   //2
        System.out.println(test1.count);     //1
    }

}
