class Super {
	int num1=10;

	void display() {
		System.out.println("Super "+num1);
	}
}

class Sub extends Super {
	int num2=20;

	void display() {
		//System.out.println("Super "+num1);
		System.out.println("Sub "+num2);
	}
}

class Super_Sub_Class {
	public static void main(String args[]) {
		Sub obj = new Sub();
		obj.display();
	}
}