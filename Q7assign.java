import java.util.Scanner;

class Employee {
    void displayRole() {
        System.out.println("Role: Employee");
    }
}

class Developer extends Employee {
    @Override
    void displayRole() {
        System.out.println("Role: Developer");
    }
}

class Manager extends Employee {
    @Override
    void displayRole() {
        System.out.println("Role: Manager");
    }
}

public class Q7assign {
    public static void main(String[] args) {
        System.out.print("Enter 1 (Employee), 2 (Developer), or 3 (Manager): ");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }

        int choice = scanner.nextInt();
        scanner.close();

        Employee emp;
        switch (choice) {
            case 2:
                emp = new Developer();
                break;
            case 3:
                emp = new Manager();
                break;
            default:
                emp = new Employee();
                break;
        }

        emp.displayRole();
    }
}

