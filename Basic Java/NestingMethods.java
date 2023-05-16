class Task1 {
	int num1,num2;

	Task1(int x,int y) {
		num1 = x;
		num2 = y;
	}

	int largest() {
		if(num1>num2)
			return num1;
		else
			return num2;
	}

	void display() {
		int answer = largest();//Nesting of loop
		System.out.println("Largest value: "+answer);
	}
}

class NestingMethods {
	public static void main(String args[]) {
		Task1 obj = new Task1(10,20);		
		obj.display();
	}
}