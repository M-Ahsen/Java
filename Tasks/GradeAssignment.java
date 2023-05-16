import java.util.Scanner;

public class GradeAssignment {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter student's score: ");
		double score = input.nextDouble();
		if (score >= 95)
			System.out.println("Grade is A+");
		else if (score >= 86 && score <= 94)
			System.out.println("Grade is A");
		else if (score >= 80 && score <= 85)
			System.out.println("Grade is A-");
		else if (score >= 76 && score <= 79)
			System.out.println("Grade is B+");
		else if (score >= 72 && score <= 75)
			System.out.println("Grade is B");
		else if (score >= 68 && score <= 71)
			System.out.println("Grade is B-");
		else if (score >= 64 && score <= 67)
			System.out.println("Grade is C+");
		else if (score >= 60 && score <= 63)
			System.out.println("Grade is C");
		else if (score >= 57 && score <= 59)
			System.out.println("Grade is C-");
		else if (score >= 54 && score <= 56)
			System.out.println("Grade is D+");
		else if (score >= 50 && score <= 53)
			System.out.println("Grade is D");
		else
			System.out.println("Grade is F");
	}
}