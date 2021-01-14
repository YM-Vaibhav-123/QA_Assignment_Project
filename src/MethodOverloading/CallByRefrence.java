package MethodOverloading;

public class CallByRefrence {

	static int num=5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallByRefrence obj = new CallByRefrence();
		passrefrence(obj);
		System.out.println("num after call by refrence = "+ num);
	}
 
	public static void passrefrence(CallByRefrence ob) {
		ob.num=50;
		System.out.println("num inside passrefrence = "+ num);
	}
}
