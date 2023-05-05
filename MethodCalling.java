public class MethodCalling {
	static int a = 10;
	static int b = 20;
    MethodCalling() {
        a=1;
        b=2;
    }

    MethodCalling(int x, int y) {
        a=x;
        b=y;
    }

	public static void add() {
		System.out.println("Addition of " + a + " and " + b + " is: " + (a+b));
	}

	public static void main(String[] args) {
    add();
	MethodCalling obj1 = new MethodCalling();
    obj1.add(); 
    add();    
    MethodCalling obj2 = new MethodCalling(100,200);
    obj2.add(); 
	add();
	}
}