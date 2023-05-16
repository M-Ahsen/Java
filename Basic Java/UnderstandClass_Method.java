class Task1 {
	int num1,num2,ans;

	void getData(int a,int b) {
		num1=a;
		num2=b;
	}

	void add() {
		ans=num1+num2;
		System.out.println("Result of addition is: "+ans);
	}
}

class UnderstandClass_Method {
	public static void main(String args[]) {
		Task1 obj = new Task1();
		obj.getData(100,200);		
		obj.add();
	}
}