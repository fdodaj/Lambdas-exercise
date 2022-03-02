package main;

import model.Student;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;
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


        //add a new Student using the Suplier
        Supplier studentSupplier = () -> students.add(new Student("Test", "Test", 16, " first year ", 10));
        studentSupplier.get();


        System.out.println("index |   Student");
        System.out.println("----------------");
        for (int counter = 0; counter < students.size(); counter++) {
            System.out.print(counter);
            System.out.print("     |   ");
            System.out.print(students.get(counter).getName());
            System.out.println();

        }

        //code that compares two students
        try {
            System.out.println("Enter two students indexes you want to compare");
            int student1 = SCANNER.nextInt();
            int student2 = SCANNER.nextInt();
            boolean compare = filter.test(students.get(student1).getGrade(), students.get(student2).getGrade());

            if (students.get(student1).getGrade() == students.get(student2).getGrade()){
                System.out.println(students.get(student1).getName()+ "(" + students.get(student1).getGrade() + ")" + " has a the same grade as " + students.get(student2).getName()+"(" + students.get(student2).getGrade() + ")");
            }
            else if (!compare){
                System.out.println(students.get(student2).getName() +"(" + students.get(student2).getGrade() + ")"   + " has a worse grade than " + students.get(student1).getName() + "(" + students.get(student1).getGrade() + ")" );
            }
            else {
                System.out.println(students.get(student1).getName()+ "(" + students.get(student1).getGrade() + ")" + " has a worse grade than " + students.get(student2).getName()+"(" + students.get(student2).getGrade() + ")"    );
            }
        }catch (Exception e){
            System.out.println("You entered an invalid index :)");
        }

        line();

        //get all passing students
        List<Student> passedStudents = students.stream().filter(s -> s.getGrade() >= 5).collect(Collectors.toList());
        passedStudents.forEach( student -> System.out.println(student.getName()+ " " + student.getSurname() + " passed" + student.getYear()));

        line();

        //get all failing students
        ts.failClass(students, a -> a.getGrade()<=4);

        line();

        //get all above average students
        bestStudents(students, (Student a) -> System.out.println(a.getName() + " performed great this season with a grade of " + a.getGrade()));

        line();
        //print the school average grade
        AtomicInteger sum = new AtomicInteger();
        getGrades(students, (Student a) -> sum.addAndGet(a.getGrade()));
        int result = sum.intValue();
        findAverage.accept((double) result, students.size());

        line();

        //print the sum of students of the school
        System.out.println("The school has a total of " + numberOfStudents.apply(students.size()) + " students.");

    }

    private void failClass(List<Student> students, Predicate<Student> predicate){
        for (Student student: students){
            if (predicate.test(student))
                System.out.println(student.getName() + " " + student.getSurname() + " failed " + student.getYear());
        }
    }


    static void bestStudents(List<Student> students, Consumer<Student> consumer) {
        for (Student student : students) {
            if (student.getGrade()>=9){
                consumer.accept(student);
            }
        }
    }

    //Function to find the number of students in the school
    static Function<Integer, String> numberOfStudents = t -> Integer.toString(t);


    static void getGrades(List<Student> students, Consumer<Student> consumer) {
        for (Student student : students) {
                consumer.accept(student);
        }
    }

    //BiConsumer to find schools average grade
    static BiConsumer<Double, Integer> findAverage = (x, y) -> System.out.println("School has a average grade of " + (x / y));


    //BiPredicate to find if student "a" has a better grade than student "b"
    static BiPredicate<Integer, Integer> filter = (a, b) -> {
        return a < b;};

    static  void line(){
        int size = 0;
        while (size < 70){
            System.out.print("=");
            size++;
        }
        System.out.println();
    }
}

