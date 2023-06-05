import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double number: ");

        try {
            double number = Double.parseDouble(scanner.nextLine());
            System.out.println("The entered number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Setting the number to 0.");
            double number = 0.0;
            System.out.println("The number is set to: " + number);
        }
    }
}