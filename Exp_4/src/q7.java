import java.util.Scanner;

class Fruit {
    private String name;
    private double pricePerKg;
    private double quantity;

   
    public Fruit(String name, double pricePerKg, double quantity) {
        this.name = name;
        this.pricePerKg = pricePerKg;
        this.quantity = quantity;
    }
    
    public double calculateTotalCost() {
        return pricePerKg * quantity;
    }
    
    public void displayDetails() {
        System.out.println("Fruit Name: " + name);
        System.out.println("Price per Kg: " + pricePerKg);
        System.out.println("Quantity (Kg): " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost());
        System.out.println("-----------------------------------");
    }

    public void updatePrice(double newPrice) {
        this.pricePerKg = newPrice;
    }

    public void updateQuantity(double newQuantity) {
        this.quantity = newQuantity;
    }
}

public class q7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first fruit name: ");
        String name1 = sc.next();
        System.out.print("Enter price per kg for " + name1 + ": ");
        double price1 = sc.nextDouble();
        System.out.print("Enter quantity (kg) of " + name1 + ": ");
        double qty1 = sc.nextDouble();

        Fruit fruit1 = new Fruit(name1, price1, qty1);

        System.out.print("Enter second fruit name: ");
        String name2 = sc.next();
        System.out.print("Enter price per kg for " + name2 + ": ");
        double price2 = sc.nextDouble();
        System.out.print("Enter quantity (kg) of " + name2 + ": ");
        double qty2 = sc.nextDouble();

        Fruit fruit2 = new Fruit(name2, price2, qty2);

        
        System.out.println("\n--- Fruit Purchase Details ---");
        fruit1.displayDetails();
        fruit2.displayDetails();

        
        System.out.print("Enter new price per kg for " + name1 + ": ");
        double newPrice = sc.nextDouble();
        System.out.print("Enter new quantity for " + name1 + ": ");
        double newQty = sc.nextDouble();          // Update details of first fruit

        fruit1.updatePrice(newPrice);
        fruit1.updateQuantity(newQty);

       
        System.out.println("\n--- Updated Fruit Details for " + name1 + " ---");
        fruit1.displayDetails();

        sc.close();
    }
}
