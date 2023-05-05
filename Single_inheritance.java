class A {
	int num1,num2;

	void getData(int num1,int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	int add() {
		System.out.println("Super class method");
		return (num1+num2);
	}
}

class B extends A {
	int multiply() {
		System.out.println("Sub-class Method");
		return (num1*num2);
	}
}

class Single_inheritance {
	public static void main(String args[]) {
		int add,multiply;
		B obj = new B();
		obj.getData(5,2);
		add = obj.add();
		multiply = obj.multiply();
		System.out.println("Addition is: "+add);
		System.out.println("Multiplaction is: "+multiply);
	}
}