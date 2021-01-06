package MethodsPackage;

public class NonStaticMethod {

	static int a=20;
    static int b=10;
	
	 void Add()
	{
		System.out.println(a+b);
	}

    void Subtract()
	{
		System.out.println(a-b);
	}
	
	 void Multiply()
	{
		System.out.println(a*b);
	}
	
	 void Divide()
	{
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		NonStaticMethod obj = new NonStaticMethod();
		obj.Add();
		obj.Subtract();
		obj.Multiply();
		obj.Divide();


	}

}
