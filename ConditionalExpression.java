import java.util.Scanner;

class ConditionalExpression {
	public static void main(String args[]) {
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter two numbers to check grester value: ");
		int num1 = obj.nextInt();
		int num2 = obj.nextInt();
		int ans = (num1>num2)?num1:num2;		
		System.out.println("Grester value is: "+ans);
	}
}