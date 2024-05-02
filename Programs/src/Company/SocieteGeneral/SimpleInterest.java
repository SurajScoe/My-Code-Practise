package Company.SocieteGeneral;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Using try-with-resources to automatically close the Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;

            do {
                System.out.println("Menu:");
                System.out.println("1. Calculate Simple Interest");
                System.out.println("2. Exit");
                System.out.print("Enter your choice: ");

                // Taking input for menu choice
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        calculateSimpleInterest(scanner);
                        break;
                    case 2:
                        System.out.println("Exiting the program. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                        break;
                }

            } while (choice != 2);
        }
    }

    private static void calculateSimpleInterest(Scanner scanner) {
        // Taking input for principal amount, rate, and time
        System.out.print("Enter Principal Amount: ");
        double principalAmount = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Rate of Interest (in percentage): ");
        double rateOfInterest = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        // Calculating simple interest
        double simpleInterest = (principalAmount * rateOfInterest * time) / 100;

        // Displaying the calculated simple interest
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
