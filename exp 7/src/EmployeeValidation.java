import java.util.Scanner;

// Exception for Invalid Employee ID
class InvalidEmpidException extends Exception {
    public InvalidEmpidException(String message) {
        super(message);
    }
}

// Exception for Invalid Name
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

//  Exception for Invalid Age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Employee class
class Employee {
    int empid;
    String name;
    int age;

    public Employee(int empid, String name, int age) {
        this.empid = empid;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("\nEmployee Details:");
        System.out.println("Emp ID : " + empid);
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
    }
}

// Main class
public class EmployeeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Employee ID: ");
            int empid = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee Age: ");
            int age = sc.nextInt();

            // Validation checks
            if (empid < 1000 || empid > 9999)
                throw new InvalidEmpidException("Employee ID must be 4 digits.");

            // Name should contain only alphabets and spaces
            if (!name.matches("[a-zA-Z ]+"))
                throw new InvalidNameException("Name must contain only alphabets.");

            if (age > 50)
                throw new InvalidAgeException("Age cannot be greater than 50.");

            // If all valid, create Employee object
            Employee emp = new Employee(empid, name, age);
            emp.display();

        } catch (InvalidEmpidException | InvalidNameException | InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please try again.");
        }

        sc.close();
    }
}
