package MethodOverloading;

public class VarialbleArgument {

	
    public static void addition(int...a) {
    	
    	int total=0;
    	for (int i=0; i<a.length; i++) {
    		total= total+a[i];
    	}
    	 System.out.println("Total is: " +total);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addition(10,20);
	}

}
