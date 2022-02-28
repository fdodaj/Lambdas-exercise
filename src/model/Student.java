package model;

public class Student extends Person {
    private String year;
    private int grade;


    public Student(String name, String surname,int age, String year, int grade) {
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

    public void setGrade(int grade) {
        this.grade = grade;
    }

}


