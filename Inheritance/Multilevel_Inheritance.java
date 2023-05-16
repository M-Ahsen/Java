class Student {
	int roll;

	void getRoll(int x) {
		roll = x;
	}

	void putRoll() {
		System.out.println("Roll no. : "+roll);
	}
}

class Test extends Student {
	int num1,num2;

	void getMarks(int x,int y) {
		num1 = x;
		num2 = y;
	}

	void putMarks() {
		System.out.println("Test 1 : "+num1);
		System.out.println("Test 2 : "+num2);
	}
}

class Result extends Test {
	int total;

	void display() {
		putRoll();
		putMarks();
		total = num1+num2;
		System.out.println("Total: "+total);
	}
}

class Multilevel_Inheritance {
	public static void main(String args[]) {
		Result obj = new Result();		
		obj.getRoll(101);
		obj.getMarks(80,85);
		obj.display();
	}
}