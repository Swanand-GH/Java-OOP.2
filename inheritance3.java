import java.util.Scanner;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

class CollegeStudent extends Student {
    String course;

    CollegeStudent(String name, String course) {
        super(name);   // Calls parent class constructor
        this.course = course;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Course: " + course);
    }
}

public class inheritance3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String course = sc.nextLine();

        CollegeStudent student = new CollegeStudent(name, course);

        student.display();
    }
}
