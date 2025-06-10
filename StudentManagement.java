package jyothi;
import java.util.ArrayList;

class Student {
    String name;
    int age;
    int grade;
    
    Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        
        // Adding 5 students
        students.add(new Student("Alice", 20, 85));
        students.add(new Student("Bob", 19, 78));
        students.add(new Student("Charlie", 21, 90));
        students.add(new Student("David", 22, 65));
        students.add(new Student("Eva", 20, 88));
        
        System.out.println("Students with grade above 80:");
        for (Student s : students) {
            if (s.grade > 80) {
                System.out.println(s.name + " (Grade: " + s.grade + ")");
            }
        }
    }
}