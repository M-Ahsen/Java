import java.util.Scanner;

public class CheckPassward1 {
	public static void main(String[] args) {
		Scanner object = new Scanner (System.in);
       	int check = 0;
		System.out.print("Please enter a string of Passward: ");
		String str = object.nextLine();
		if(str.length()>10) {
            for(int i=0;i<str.length();i++) {
                if(str.charAt(i)>='0' && str.charAt(i)<='9')
                    check=1;
            }
            for(int j=0;j<str.length();j++) {
                if(str.charAt(j)>='A' && str.charAt(j)<='Z') {
                    check++;
                    break;
                }
            }
		}       
        if(check<2)
            System.out.println("Please enter a strong passward");
	}
}