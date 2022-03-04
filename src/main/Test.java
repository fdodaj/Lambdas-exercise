package main;

<<<<<<< HEAD
=======
import model.Person;
>>>>>>> main
import model.Student;

public class Test {
    public static void main(String[] args) {
<<<<<<< HEAD
        System.out.println(Student.counter);  //0

        Student test = new Student();
        System.out.println(Student.counter);   //1
        System.out.println(test.count);     //1
        Student test1 = new Student();
        System.out.println(test1.counter);   //2
        System.out.println(test1.count);     //1
    }

=======
        System.out.println(Student.counter); //0

        Student test = new Student();
        System.out.println(Student.counter);    //1
        System.out.println(test.count);         //1

        Student test2 = new Student();
        System.out.println(Student.counter);    //2
        System.out.println(test.count);         //1
    }
>>>>>>> main
}
