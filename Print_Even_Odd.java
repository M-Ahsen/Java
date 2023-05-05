import java.util.Scanner;

class Print_Even_Odd {
	public static void main(String args[]) {
		String check = " ";
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = obj.nextInt();
		//Check even or odd
		check = (num%2==0)?"Even":"Odd";
		//Print numbers		
		if(check=="Even")
			for(int i=0;i<=num;i+=2)
				System.out.print(i+"\t");
		else
			for(int i=1;i<=num;i+=2)
				System.out.print(i+"\t");
	}
}