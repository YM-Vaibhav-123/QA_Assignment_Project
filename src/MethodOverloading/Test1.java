package MethodOverloading;

public class Test1 {

	
	static void test1 (int a, int b) {
		
		System.out.println("Variable");
	}
	
	static void test1 (int...a) {
		System.out.println("Var-ags");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Test1 t1 = new Test1();
		test1(10);
	}

}
