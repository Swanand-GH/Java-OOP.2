import java.util.Scanner;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class MultiStudent extends Person {
    String studentId;

    MultiStudent(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }

    void displayStudent() {
        System.out.println("Student ID: " + studentId);
    }
}

class GraduateStudent extends MultiStudent {
    String researchArea;

    GraduateStudent(String name, String studentId, String researchArea) {
        super(name, studentId);
        this.researchArea = researchArea;
    }

    void displayGraduateStudent() {
        System.out.println("Research Area: " + researchArea);
    }
}

public class multilevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String studentId = sc.nextLine();
        String researchArea = sc.nextLine();

        GraduateStudent student =
            new GraduateStudent(name, studentId, researchArea);

        student.displayPerson();
        student.displayStudent();
        student.displayGraduateStudent();
    }
}
