package MethodsPackage;

class Fibonnaci{
	
	void Number(int a, int b) {
		int n=7;
		int c;
		
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<=n;i++)
		{
		 c=a+b;
         System.out.println(c);
         a=b;
         b=c;
		}
	}
}


public class NumberFB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fibonnaci obj = new Fibonnaci();
		obj.Number(0, 1);
	}

}