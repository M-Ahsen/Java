class One {
	int num1=10,num2=20;
	void display() {
		System.out.println("Method of class One");
		System.out.println("Value of num1: "+num1);
		System.out.println("Value of num2: "+num2);
	}
}

class Two extends One {
	void add() {
	System.out.println("Method of class Two");
	System.out.println("Addition: "+(num1+num2));	
	}
}

class Three extends One {
	void multiply() {
	System.out.println("Method of class Three");
    System.out.println("Multiplication: "+(num1*num2));	
	}
}

class Hierarchical_Inheritance {
	public static void main(String args[]) {
		Two obj1 = new Two();
		Three obj2 = new Three();		
		obj1.display();
		obj1.add();
		obj2.multiply();
	}
}