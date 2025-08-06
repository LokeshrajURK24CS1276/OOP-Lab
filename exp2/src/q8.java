import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers (space-separated):");
        String input = sc.nextLine(); // Read the whole line
        String[] tokens = input.split(" "); // Split by spaces

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(tokens[i]); // Convert each to int
        }

        System.out.print("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.print("\nOdd Array : ");
        for (int num : arr) {
            if (num % 2 != 0)
                System.out.print((num * num) + " ");
        }

        System.out.print("\nEven Array : ");
        for (int num : arr) {
            if (num % 2 == 0)
                System.out.print((num * num * num) + " ");
        }
    }
}
