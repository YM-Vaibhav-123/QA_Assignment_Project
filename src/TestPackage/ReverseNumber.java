package TestPackage;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=789; 
		int reverse=0;
		
		while(n>0) 
		{
			reverse=reverse*10+n%10;
			n/=10;
		}
		
		System.out.println(reverse);
	}

}
