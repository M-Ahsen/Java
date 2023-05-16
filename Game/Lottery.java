import java.util.Scanner;

class Lottery {
	public static void main(String args[]) {
		//Lottery numbers:9,5,2	
		int num,num1=9,num2=5,num3=2;
		int digit1=0,digit2=0,digit3=0;
		System.out.print("Enter three-digit number: ");	
		Scanner obj = new Scanner(System.in);
		num=obj.nextInt();
		digit1=num/100;
		digit2=(num/10)%10;
		digit3=num%10;
		if((num1==digit1||num1==digit2||num1==digit3)&&(num2==digit1||num2==digit2||num2==digit3)&&(num3==digit1||num3==digit2||num3==digit3))
			System.out.println("Congratulations! You 10,000$");
		else if((num1==digit1||num1==digit2||num1==digit3)&&(num2==digit1||num2==digit2||num2==digit3)||(num3==digit1||num3==digit2||num3==digit3)&&
			(num1==digit1||num1==digit2||num1==digit3)||(num2==digit1||num2==digit2||num2==digit3)&&(num3==digit1||num3==digit2||num3==digit3))
			System.out.println("Congratulations! You 3,000$");
		else if((num1==digit1||num1==digit2||num1==digit3)||(num2==digit1||num2==digit2||num2==digit3)||(num3==digit1||num3==digit2||num3==digit3))
			System.out.println("Congratulations! You 1,000$");			
		else
			System.out.println("Sorry, you did not win this time.");
	}
} 