import java.util.Scanner;

// Base class
class Worker {
    protected String name;
    protected double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public double computePay(int hours) {
        return salaryRate * hours; // Default calculation
    }

    public void displayPay(double pay) {
        System.out.println("Worker Name: " + name);
        System.out.println("Weekly Pay: " + pay);
        System.out.println("----------------------------");
    }
}

// Subclass for Daily Worker
class DailyWorker extends Worker {
    private int noOfDays;

    public DailyWorker(String name, double salaryRate, int noOfDays) {
        super(name, salaryRate);
        this.noOfDays = noOfDays;
    }

    
    public double computePay(int hours) {
        return salaryRate * noOfDays; // Paid per day
    }
}

// Subclass for Salaried Worker
class SalariedWorker extends Worker {
    private int noOfHours;

    public SalariedWorker(String name, double salaryRate, int noOfHours) {
        super(name, salaryRate);
        this.noOfHours = noOfHours;
    }

    
    public double computePay(int hours) {
        return salaryRate * 40; // Fixed for 40 hours
    }
}

// Main class
public class q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Worker Pay Menu ---");
            System.out.println("1. Daily Worker");
            System.out.println("2. Salaried Worker");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 3) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter Worker Name: ");
            String name = sc.next();

            System.out.print("Enter Salary Rate: ");
            double rate = sc.nextDouble();

            Worker w = null; // Runtime polymorphism

            switch (choice) {
                case 1:
                    System.out.print("Enter number of days worked: ");
                    int days = sc.nextInt();
                    w = new DailyWorker(name, rate, days);
                    break;

                case 2:
                    System.out.print("Enter number of hours worked: ");
                    int hours = sc.nextInt();
                    w = new SalariedWorker(name, rate, hours);
                    break;

                default:
                    System.out.println("Invalid choice!");
                    continue;
            }

            // Compute pay using overridden method
            double pay = w.computePay(40);
            w.displayPay(pay);
        }

        sc.close();
    }
}
