package inheritance;

public class ProgramOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c =new C();
		c.test1();
	}
	}
    class A {
	public void test1() {
		System.out.println("1st Method");
	}
    }
    
    class B extends A {
	public void test1() {
		System.out.println("2nd Method");
	}
}

    class C {
    	public void test1() {
    		System.out.println("3rd Method");
    	}
    }