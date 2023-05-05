import java.util.Scanner;

public class CheckPassward {
	public static void main(String[] args) {
		Scanner obj = new Scanner (System.in);
		System.out.print("Please enter a string of Passward: ");
		String str = obj.nextLine();
		//If all condition true than print nothing, otherwise print the statement
		if(!(checkLength(str)&&checkDigit(str)&&checkCase(str)))
			System.out.println("Please enter a strong passward");
	}

	//First method to check length, greater than 10 or not
	public static boolean checkLength(String x) {
		boolean check = false;
		if(x.length()>10)
			check = true;
		return check;
	}

	//Second method to check at least one digit
	public static boolean checkDigit(String x) {
		boolean check = false;
		for(int i=0;i<x.length();i++) {
			if(x.charAt(i)>='0' && x.charAt(i)<='9')
				check = true;
		}
		return check;
	}

	//Third method to check at least one capital case
	public static boolean checkCase(String x) {
		boolean check = false; 
		for(int i=0;i<x.length();i++) {
			if(x.charAt(i)>='A' && x.charAt(i)<='Z')
		check = true;
		}
		return check;
	}
}