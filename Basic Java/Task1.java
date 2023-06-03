/*class Task1 {

	public static void main(String args[]) {
		int a=20;
		int b=10;
		System.out.println("ANSWER: " + (a+b));
	}

}*/


/*class Task1 {

	int method (int x, int y) {
		return x+y;
	}

	public static void main(String args[]) {
		Task1 obj = new Task1();
		int a=20;
		int b=10;
		System.out.println("ANSWER: " + obj.method(a,b));

	}

}*/


/*class Task1 {

	static int method (int x, int y) {
		return x+y;
	}

	public static void main(String args[]) {
		int a=20;
		int b=10;
		System.out.println("ANSWER: " + method(a,b));

	}

}*/


/*class Task1 {

	static int method () {
		return 50;
	}

	public static void main(String args[]) {
		System.out.println("ANSWER: " + method());
	}
}*/


/*class Task1 {

	static void method () {
		System.out.println("ANSWER: " + 100);
	}

	public static void main(String args[]) {
		method();
	}
}*/


/*class Task1 {

	static void method (int x, int y) {
		System.out.println("ANSWER: " + (x+y));
	}

	public static void main(String args[]) {
		method(10,20);
	}
}*/


class Task1 {
	int i;
	int j;

	Task1(int a, int b){
		i=a;
		j=b;
	}
	static void method (int x, int y) {
		System.out.println("ANSWER: " + (x+y));
	}

	public static void main(String args[]) {
		method(10,20);
	}
}