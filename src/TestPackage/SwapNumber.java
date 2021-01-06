package TestPackage;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=10;
    int b=20;
    
    System.out.println("before");
    System.out.println(a);
    System.out.println(b);

    a=a*b;
    b=a/b;
    a=a/b;

    System.out.println("after");
    System.out.println(a);
    System.out.println(b); 
	}

}
