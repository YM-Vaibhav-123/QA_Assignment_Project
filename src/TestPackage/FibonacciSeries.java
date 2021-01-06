package TestPackage;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=7, a=0,b=1,c;
		System.out.println(a);
//		System.out.println(b);
		
	   // for(c=0;c<=n; c++)
		
		while(n>=0)
	{	
		c=a+b;
		
		System.out.println(b);
//		b++;
		
		a=b;
		b=c;
		//b=d;
		n--;
	}

}
}