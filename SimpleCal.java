import java.util.*;

public class SimpleCal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter First Number:");
            int num1 = sc.nextInt();
            System.out.println("Enter Second Number:");
            int num2 = sc.nextInt();

            System.out.println(
                    "Enter\n + for Addition\n - for Subtraction\n * for Multiplication\n / for Division\n % for Mod ");
            String input = sc.next();

            switch (input) {
                case "+":
                    System.out.println("Addition of two numbers is: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Subtraction of two numbers is: " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("Multiplication of two numbers is: " + (num1 * num2));
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Infinity.");
                    } else {
                        System.out.println("Division of two numbers is: " + (num1 / num2));
                    }
                    break;
                case "%":
                    if (num2 == 0) {
                        System.out.println("Infinity");
                    } else {
                        System.out.println("Mod of two numbers is: " + (num1 % num2));
                    }
                    break;
                default:
                    System.out.println("Invalid Input");
            }

            System.out.println("Enter Y to continue or N to exit");
            String op = sc.next();
            if (op.equalsIgnoreCase("N")) {
                System.out.println("Exiting...");
                break;
            }
        }
        sc.close();
    }
}