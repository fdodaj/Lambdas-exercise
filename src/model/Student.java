package model;

import java.util.function.UnaryOperator;

public class Student extends Person {
    private String year;
    private int grade;
<<<<<<< HEAD
    public static int counter;
    public int count;


    public Student() {
        counter++;
        count++;
    }

=======
    private boolean passesClass;
    public static int counter;
    public int count;
>>>>>>> main

    public Student() {
        counter++;
        count++;
    }

    public Student(String name, String surname, int age, String year, int grade) {
        super.name = name;
        super.surname = surname;
        super.age = age;
        this.year = year;
        this.grade = grade;
    }
    public Student(String name, String surname, int grade){
        super.name = name;
        super.surname = surname;
        this.grade = grade;

    }


    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

}


