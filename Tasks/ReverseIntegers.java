import java.util.Scanner;
 
public class ReverseIntegers {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for(int i=0; i<10; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("The numbers in reverse order are: ");       
        for(int i=9; i>=0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}