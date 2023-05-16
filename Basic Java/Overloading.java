class Task1 {
	int num1,num2;

	void calculation(int x) {
		num1 = x;
		System.out.println("Square is: "+(num1*num1));
	}

	void calculation(int x,int y) {
		num1=x;
		num2=y;
		System.out.println("Addition is: "+(num1+num2));
	}
}

class Overloading {
	public static void main(String args[]) {
		Task1 obj=new Task1();		
		obj.calculation(10,20);
		obj.calculation(10);
	}
}