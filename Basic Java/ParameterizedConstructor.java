class Task1 {
	int length,width,result;

	Task1(int x,int y) {
		length=x;
		width=y;
	}

	void rectangleArea() {
		result=length*width;
		System.out.println("Area of Rectangle is: "+result);
	}
}

class ParameterizedConstructor {
	public static void main(String args[]) {
		Task1 obj = new Task1(10,20);		
		obj.rectangleArea();
	}
}