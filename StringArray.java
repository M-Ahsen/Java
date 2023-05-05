import java.util.Scanner;

class StringArray {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		String arr[] = new String[5];
		System.out.println("Enter five colors name:");
		for(int i=0;i<5;i++){
			arr[i] = obj.nextLine();
		}
		//Display Length
		for(int i=0;i<5;i++) {
		System.out.println((i+1)+". Color length = "+arr[i].length());
		}
	}
}