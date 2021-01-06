package MethodsPackage;

class Add {
	void addnumber (int j) {
		
		int rem=0;
		while(j>0) {
			
			rem=rem+(j%10);
			j/=10;
		}
		System.out.println(rem);
	}
}

public class NumberSum 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Add A = new Add();
		A.addnumber(1234);
	}

}
