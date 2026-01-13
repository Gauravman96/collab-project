import java.util.Scanner;
public class add {
    
    public static void main(String[] args) {

        // Step 1: Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Step 2: Take first number
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        // Step 3: Take second number
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Step 4: Calculate sum
        int sum = num1 + num2;

        // Step 5: Print result
        System.out.println("Sum of two numbers = " + sum);

        // Step 6: Close scanner
        sc.close();
    }
}
