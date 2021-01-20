package MethodOverloading;

import inheritance.FirstInheritance;

public class ThirdInheritance extends FirstInheritance{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   ThirdInheritance third = new ThirdInheritance();
	   third.test01111();
	}
    
    private void test033(){
    	
    	System.out.println("Test033 Method");
    }

    void test0333(){
	
	System.out.println("Test0333 Method");
}

   protected void test03333(){
	
	System.out.println("Test03333 Method");
}
}
