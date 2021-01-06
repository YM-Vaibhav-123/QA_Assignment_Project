package MethodsPackage;

public class ParameterCalculator {

	public static void Add(int a, int b) {
		
		System.out.println(a+b);
	}
	
    public static void Sub(int c, int d) {
		
		System.out.println(c-d);
	}

    public static void Multiply (int e, int f) {
	
	System.out.println(e*f);
    }

    public static void Divide(int g, int h) {
	
	System.out.println(g/h);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ParameterCalculator.Add(20,10);
		ParameterCalculator.Sub(100,50);
		ParameterCalculator.Multiply(3,2);
		ParameterCalculator.Divide(25,5);
		
	}

}
