import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10]; 

        
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nOdd Array: ");
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print((arr[i] * arr[i]) + " ");
            }
        }
        System.out.print("\nEven Array: ");
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print((arr[i] * arr[i] * arr[i]) + " ");
            }}}}
