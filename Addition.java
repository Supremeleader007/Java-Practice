import java.util.Scanner;

// This function is used for adding to values

public class Addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println("Sum: " + sum);

        scanner.close();
    }
}
