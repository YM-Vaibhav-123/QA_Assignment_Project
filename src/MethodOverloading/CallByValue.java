package MethodOverloading;

public class CallByValue {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 25;
		
		System.out.println("Before calling display method number = "+number);
		display(number);
		System.out.println("After calling display method number = "+number);
	}
	
	public static void display(int num) {
		
		System.out.println("Inside display method num = "+num);
		num = 100;
		System.out.println("Inside display method num = "+num);
	}
}
