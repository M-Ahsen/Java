import java.util.Scanner;

public class PIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the PIN number (4 digits): ");
        String input = scanner.nextLine();
        verifyPIN(input);
    }

    public static void verifyPIN(String input) {
        if (input.length() != 4) {
            System.out.println("Error: PIN must have exactly 4 digits.");
        } 
        else if (!input.equals("3454")) {
            System.out.println("Error: Invalid PIN number.");
        } 
        else {
            System.out.println("Success: PIN verified.");
        }
    }
}