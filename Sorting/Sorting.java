import java.util.Scanner;

class Sorting {
	public static void main(String args[]) {
		int arr[]=new int[3];
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter three integers: ");
		for(int i=0;i<3;i++)
			arr[i]=obj.nextInt();
		for(int i=0;i<3;i++)
			for(int j=i+1;j<3;j++)
				if(arr[i]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}				
	    for(int i=0;i<3;i++)
			System.out.print(arr[i]+"\t");
	}
}