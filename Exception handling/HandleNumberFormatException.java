import java.util.Scanner;

public class HandleNumberFormatException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            double number = Double.parseDouble(input);
            System.out.println("Number entered: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Setting number to 0.");
            double number = 0;
            System.out.println("Number set to: " + number);
        }

        scanner.close();
    }
}
