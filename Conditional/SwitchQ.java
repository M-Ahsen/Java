import java.util.Scanner;

public class SwitchQ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two integers separated by a space: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);
        
        switch(operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if(b == 0) {
                    System.out.println("Invalid Division");
                } else {
                    System.out.println(a / b);
                }
                break;
            case '%':
                if(b == 0) {
                    System.out.println("Invalid Division");
                } else {
                    System.out.println(a % b);
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}