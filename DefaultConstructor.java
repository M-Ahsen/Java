class Task1 {
	int num1,num2;

	Task1() {
		System.out.println("Default Constructor");
		num1=10;
		num2=20;
	}

	void display() {
		System.out.println("The value of num1 is "+num1);
		System.out.println("The value of num2 is "+num2);
	}
}

class DefaultConstructor {
	public static void main(String args[]) {
		Task1 obj = new Task1();		
		obj.display();
	}
}