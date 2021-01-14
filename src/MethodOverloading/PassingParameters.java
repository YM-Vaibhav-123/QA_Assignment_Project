package MethodOverloading;

public class PassingParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SayHello("Vaibhav");
		int sum = Add(10,20,30);
		System.out.println("Addition is " +sum);
		
	}

	public static void SayHello(String name) {
		System.out.println("Hello " +name);
	}
	
	//public static void Add(int a, int b) {
		
	//	System.out.println(a+b);}
	
	public static int Add(int a, int b, int c) {
		
		return (a+b+c);
	}
}
