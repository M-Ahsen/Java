abstract class X {
	abstract void display();

	void disp() {
		System.out.println("Method from X Class");
	}
}

class Y extends X { 
	void display() {
		System.out.println("Method defined in Y Class");
	}
}

class Abstract_Method {
	public static void main(String args[]) {
		Y obj = new Y();
		obj.disp();
		obj.display();
	}
}