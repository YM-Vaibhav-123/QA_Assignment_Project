package MethodOverloading;

public class Calculator {

	int calculations(String st1, int...a) 
	{
		int sum=0;	
		for(int i=0; i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println();
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator Obj = new Calculator();
		int ans;
		ans=Obj.calculations("Display of Calculations", 30,40,5,80);
		
		System.out.println("Total sum is " +ans);
	}

}
