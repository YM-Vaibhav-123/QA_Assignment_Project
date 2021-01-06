package MethodsPackage;

public class Calculator {

	static int a=20, b=10;
	
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
		// if (b==0)
		//System.out.println("b should be zero");
		// else
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
