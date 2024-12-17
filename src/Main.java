import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Welcome to Generic Maximum Finder Program!");
        while (!exit) {
            System.out.println("\nSelect Use Case:");
            System.out.println("1. Find maximum of three integers");
            System.out.println("2. Find maximum of three floats");
            System.out.println("3. Find maximum of three strings");
            System.out.println("4. Find maximum of more than three values");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    TestMaximum.testIntegerMax();
                    break;
                case 2:
                    TestMaximum.testFloatMax();
                    break;
                case 3:
                    TestMaximum.testStringMax();
                    break;
                case 4:
                    TestMaximum.testMaxMultiple();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting Program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        scanner.close();
    }
}
