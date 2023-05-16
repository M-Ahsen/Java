import java.util.Scanner;

class CheckString {
	public static void main(String args[]) {
		String input,x="",y="";
		System.out.print("Enter a Line: ");
		Scanner obj = new Scanner (System.in);
		input = obj.nextLine();
		//Check 1st Letter
		char firstLetter = input.charAt(0);
		if(firstLetter>='A'&&firstLetter<='Z')
		    x = "Capital Case";
		else if(firstLetter>='a'&&firstLetter<='z')
			x = "Small Case";
		//Check Length
		int length = input.length();
		//Check Word
		if(input.contains("Welcome"))
			y = "It contains word Welcome";
		else
			y = "It does not contain word Welcome";
		System.out.println("First Letter consists of: "+x);
		System.out.println("Length of string: "+length);
		System.out.println(y);
	}
}