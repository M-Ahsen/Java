class Task1 {
	static int cube(int x) {
		return(x*x*x);
	}
}

class StaticKeyword {
	public static void main(String args[]) {
		int result = Task1.cube(10);		
		System.out.println("Cube is: "+result);
	}
}