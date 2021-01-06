package MethodsPackage;

class Reverse {
	
	void reversenumber (int num) {
		
		int rev=0;
		while(num>0) 
		{
			rev=rev*10+num%10;
			num/=10;
		}
		System.out.println(rev);
	}
}

public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Reverse ab = new Reverse();
		ab.reversenumber(123);
	}

}
