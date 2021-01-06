package MethodsPackage;

public class TestCalculator {

	static int a=15, b=5;
	
	static void Add()
	{
		System.out.println(a+b);
	}

	static void Subtract()
	{
		System.out.println(a-b);
	}
	
	static void Multiply()
	{
		System.out.println(a*b);
	}
	
	static void Divide()
	{
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator.Add();
		Calculator.Subtract();
		Calculator.Multiply();
		Calculator.Divide();
	}

}
