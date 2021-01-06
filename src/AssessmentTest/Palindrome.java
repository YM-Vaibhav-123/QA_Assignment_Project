package AssessmentTest;

public class Palindrome {

	public static void main(String[] args) {
		
		int num = 101; int x=0;
		int reverse= 101;
		
		while (num>0) {
			//int rem=num%10;  
			x =(x*10)+(num%10);
			num/=10;
		}
		
		if (reverse==x) {
			System.out.println("\n Enterned number is Palindrom");
		}
		else {
			System.out.println("\n Enterned number is not Palindrom");
		}
		// TODO Auto-generated method stub

	}

}
