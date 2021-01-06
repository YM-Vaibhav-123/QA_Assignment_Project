package TestPackage;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=121; int x =0;
		int reverse=121;
		
		
		while (num>0)
		{
			int rem = num%10;
			x = (x * 10) + rem;
			num/=10;
			
		}
		
		
		//System.out.print("\n Enterned Number is:" +reverse);
		
		//System.out.print("\n Reversed Number is:" +x);
		
		if(reverse==x)
		{
			System.out.println("\n Enterned number is Palindrom");
		}
		else
		{
			System.out.println("\n Enterned number is not Palindrom");
		}

	}

}
