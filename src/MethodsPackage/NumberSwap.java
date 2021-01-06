package MethodsPackage;

class Swap {
	
	void replacenumber(int a, int b) {
		
	int c=a;
		a=b;
		b=c;
		
		System.out.println("Swapped"+a+""+b);
	}
   
}

public class NumberSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Swap Obj = new Swap();
     Obj.replacenumber(5,4);
		
	}

}
