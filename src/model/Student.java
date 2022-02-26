package model;

public class Student extends Person {
    private String year;
    private int grade;
    private boolean passesClass;

    public Student(String name, String surname,int age, String year, int grade) {
        super.name = name;
        super.surname = surname;
        super.age = age;
        this.year = year;
        this.grade = grade;
        if (grade < 5)
            this.passesClass = false;
        else
            this.passesClass = true;


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

    public boolean passesClass() {
        return passesClass;
    }

    public void setPassesClass(boolean passesClass) {
        this.passesClass = passesClass;
    }
}


