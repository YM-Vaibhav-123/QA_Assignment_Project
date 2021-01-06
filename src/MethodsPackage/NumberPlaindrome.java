package MethodsPackage;

class Palindrome {
	
	void checkpalindrome (int num) {
	
	int rev=0;int x=num;
	while (num>0) {
		
		rev=rev*10+(num%10);
		num/=10;
	}
	System.out.println(rev);
	
	if(rev==x) {
		System.out.println("Number is Plaindrome");
	}
	else {
		System.out.println("Number is not Plaindrome");
	}
}
}
public class NumberPlaindrome 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Palindrome obj = new Palindrome();
		obj.checkpalindrome(121);
	}

}
