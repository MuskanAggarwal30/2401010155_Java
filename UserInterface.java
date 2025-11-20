import java.util.Scanner;
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
    }
}
public class UserInterface {
    Scanner sc = new Scanner(System.in);
    Calculator calc = new Calculator();
    public void performAddition() {
        System.out.println("\n--- Addition Menu ---");
        System.out.println("1. Add two integers");
        System.out.println("2. Add two doubles");
        System.out.println("3. Add three integers");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter two integers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Result = " + calc.add(a, b));
                break;
            case 2:
                System.out.print("Enter two doubles: ");
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                System.out.println("Result = " + calc.add(x, y));
                break;
            case 3:
                System.out.print("Enter three integers: ");
                int p = sc.nextInt();
                int q = sc.nextInt();
                int r = sc.nextInt();
                System.out.println("Result = " + calc.add(p, q, r));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
    public void performSubtraction() {
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Result = " + calc.subtract(a, b));
    }
    public void performMultiplication() {
        System.out.print("Enter two double values: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Result = " + calc.multiply(a, b));
    }
    public void performDivision() {
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Result = " + calc.divide(a, b));
    }
    public void mainMenu() {
        int choice;
        do {
            System.out.println("\n===== CALCULATOR MENU =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    performAddition();
                    break;
                case 2:
                    performSubtraction();
                    break;
                case 3:
                    performMultiplication();
                    break;
                case 4:
                    performDivision();
                    break;
                case 5:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 5);
    }
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.mainMenu();
    }
}
